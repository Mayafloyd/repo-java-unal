package Actividad3_19_Cap3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TrianguloEquilateroGUI extends JFrame {
    private JLabel lblLado, lblPerimetro, lblAltura, lblArea;
    private JTextField txtLado;
    private JButton btnCalcular;

    public TrianguloEquilateroGUI() {
        // Configurar ventana principal
        setTitle("Triangulo Equilatero");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null);

        // Crear componentes
        lblLado = new JLabel("Lado:");
        lblPerimetro = new JLabel("Perimetro:");
        lblAltura = new JLabel("Altura:");
        lblArea = new JLabel("Area:");
        txtLado = new JTextField(10);
        btnCalcular = new JButton("Calcular");

        // Configurar panel de contenido
        JPanel contentPane = new JPanel();
        contentPane.setLayout(new GridLayout(4, 2));
        contentPane.add(lblLado);
        contentPane.add(txtLado);
        contentPane.add(lblPerimetro);
        contentPane.add(new JLabel());
        contentPane.add(lblAltura);
        contentPane.add(new JLabel());
        contentPane.add(lblArea);
        contentPane.add(new JLabel());
        contentPane.add(btnCalcular);

        // Agregar listeners
        btnCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Obtener valores de entrada
                Double lado = Double.parseDouble(txtLado.getText());

                // Calcular perimetro, altura y area
                Double perimetro = lado * 3;
                Double altura = Math.sqrt((lado*lado) - Math.pow((lado/2), 2));
                Double area = (lado*altura)/2;

                // Mostrar resultados
                lblPerimetro.setText("Perimetro: " + perimetro);
                lblAltura.setText("Altura: " + altura);
                lblArea.setText("Area: " + area);
            }
        });

        // Agregar panel de contenido a la ventana principal
        setContentPane(contentPane);
    }

    public static void main(String[] args) {
        TrianguloEquilateroGUI frame = new TrianguloEquilateroGUI();
        frame.setVisible(true);
    }
}