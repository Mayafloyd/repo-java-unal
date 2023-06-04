package Actividad4.Punto5;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;



public class VentanaPrincipal extends JFrame implements ActionListener {
    private DefaultListModel<String> modelo;
    private JList<String> listaNombres;
    private JButton añadir;
    private JButton editar;
    private JTextField campoNombre;
    private JTextField campoApellidos;
    private JTextField campoTelefono;
    private JTextField campoDireccion;
    private ListaPersonas lista;

    public VentanaPrincipal() {
        lista = new ListaPersonas();
        modelo = new DefaultListModel<>();
        listaNombres = new JList<>(modelo);

        JLabel etiquetaNombre = new JLabel("Nombre:");
        campoNombre = new JTextField();
        JLabel etiquetaApellidos = new JLabel("Apellidos:");
        campoApellidos = new JTextField();
        JLabel etiquetaTelefono = new JLabel("Teléfono:");
        campoTelefono = new JTextField();
        JLabel etiquetaDireccion = new JLabel("Dirección:");
        campoDireccion = new JTextField();

        añadir = new JButton();
        editar = new JButton();

        setTitle("Lista de Personas");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(350, 350);
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(null);
        setVisible(true);

        etiquetaNombre.setBounds(20, 20, 100, 25);
        campoNombre.setBounds(130, 20, 200, 25);
        etiquetaApellidos.setBounds(20, 50, 100, 25);
        campoApellidos.setBounds(130, 50, 200, 25);
        etiquetaTelefono.setBounds(20, 80, 100, 25);
        campoTelefono.setBounds(130, 80, 200, 25);
        etiquetaDireccion.setBounds(20, 110, 100, 25);
        campoDireccion.setBounds(130, 110, 200, 25);

        añadir.setText("Añadir");
        añadir.setBounds(20, 145, 80, 23);
        añadir.addActionListener(this);

        editar.setText("Editar");
        editar.setBounds(20, 245, 80, 23);
        editar.addActionListener(this);

        listaNombres.setBounds(20, 180, 310, 60);
        listaNombres.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        listaNombres.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent evento) {
                int index = listaNombres.getSelectedIndex();
                if (index >= 0) {
                    Persona personaSeleccionada = lista.getPersona(index);
                    campoNombre.setText(personaSeleccionada.getNombre());
                    campoApellidos.setText(personaSeleccionada.getApellidos());
                    campoTelefono.setText(personaSeleccionada.getTelefono());
                    campoDireccion.setText(personaSeleccionada.getDireccion());
                }
            }
        });

        Container contenedor = getContentPane();
        contenedor.add(etiquetaNombre);
        contenedor.add(campoNombre);
        contenedor.add(etiquetaApellidos);
        contenedor.add(campoApellidos);
        contenedor.add(etiquetaTelefono);
        contenedor.add(campoTelefono);
        contenedor.add(etiquetaDireccion);
        contenedor.add(campoDireccion);
        contenedor.add(añadir);
        contenedor.add(editar);
        contenedor.add(listaNombres);
    }

    public void actionPerformed(ActionEvent evento) {
        if (evento.getSource() == añadir) {
            añadirPersona();
        } else if (evento.getSource() == editar) {
            editarPersona();
        }
    }

    private void añadirPersona() {
        String nombre = campoNombre.getText();
        String apellidos = campoApellidos.getText();
        String telefono = campoTelefono.getText();
        String direccion = campoDireccion.getText();

        // Check if the person is already in the list
        if (lista.existePersona(nombre, apellidos)) {
            JOptionPane.showMessageDialog(this, "La persona ya existe en la lista.", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            Persona p = new Persona(nombre, apellidos, telefono, direccion);
            lista.añadirPersona(p);
            modelo.addElement(p.getDatosPersona());
            campoNombre.setText("");
            campoApellidos.setText("");
            campoTelefono.setText("");
            campoDireccion.setText("");
        }
    }

    private void editarPersona() {
        int index = listaNombres.getSelectedIndex();
        if (index >= 0) {
            String nombre = campoNombre.getText();
            String apellidos = campoApellidos.getText();
            String telefono = campoTelefono.getText();
            String direccion = campoDireccion.getText();

            // Check if the person is already in the list (excluding the selected index)
            if (lista.existePersona(nombre, apellidos, index)) {
                JOptionPane.showMessageDialog(this, "La persona ya existe en la lista.", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                Persona p = new Persona(nombre, apellidos, telefono, direccion);
                lista.editarPersona(index, p);
                modelo.setElementAt(p.getDatosPersona(), index);
                campoNombre.setText("");
                campoApellidos.setText("");
                campoTelefono.setText("");
                campoDireccion.setText("");
            }
        }
    }

    public static void main(String[] args) {
        new VentanaPrincipal();
    }
}

class Persona {
    private String nombre;
    private String apellidos;
    private String telefono;
    private String direccion;

    public Persona(String nombre, String apellidos, String telefono, String direccion) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getDatosPersona() {
        return nombre + " " + apellidos;
    }
}

class ListaPersonas {
    private java.util.List<Persona> lista;

    public ListaPersonas() {
        lista = new java.util.ArrayList<>();
    }

    public void añadirPersona(Persona persona) {
        lista.add(persona);
    }

    public void editarPersona(int index, Persona persona) {
        lista.set(index, persona);
    }

    public Persona getPersona(int index) {
        return lista.get(index);
    }

    public boolean existePersona(String nombre, String apellidos) {
        for (Persona persona : lista) {
            if (persona.getNombre().equals(nombre) && persona.getApellidos().equals(apellidos)) {
                return true;
            }
        }
        return false;
    }

    public boolean existePersona(String nombre, String apellidos, int excludeIndex) {
        for (int i = 0; i < lista.size(); i++) {
            if (i != excludeIndex) {
                Persona persona = lista.get(i);
                if (persona.getNombre().equals(nombre) && persona.getApellidos().equals(apellidos)) {
                    return true;
                }
            }
        }
        return false;
    }
}

