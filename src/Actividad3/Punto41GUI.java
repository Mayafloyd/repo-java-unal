package Actividad3;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Punto41GUI extends JFrame {

    private static final long serialVersionUID = 1L;
    private static ArrayList<Integer> numbers = new ArrayList<Integer>();
    private JButton button;
    private JTextField textField;
    private JTextArea textArea;

    public Punto41GUI() {
        super("Punto 41");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        textArea = new JTextArea();
        panel.add(textArea, BorderLayout.CENTER);

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new BorderLayout());

        textField = new JTextField();
        inputPanel.add(textField, BorderLayout.CENTER);

        button = new JButton("Agregar");
        inputPanel.add(button, BorderLayout.EAST);

        panel.add(inputPanel, BorderLayout.SOUTH);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int num = Integer.parseInt(textField.getText());
                    if (num == 0) {
                        // Si se ingresa un 0, mostrar el número máximo y deshabilitar el botón
                        int numeroMax = 0;
                        for (int i = 0; i < numbers.size(); i++) {
                            if (numbers.get(i) > numeroMax) {
                                numeroMax = numbers.get(i);
                            }
                        }
                        textArea.append("Número mayor: " + numeroMax + "\n");
                        button.setEnabled(false);
                    } else {
                        // Agregar el número a la lista y mostrar en la interfaz
                        numbers.add(num);
                        textArea.append(num + "\n");
                        textField.setText("");
                    }
                } catch (NumberFormatException ex) {
                    // Si se ingresa un valor no numérico, mostrar un mensaje de error
                    JOptionPane.showMessageDialog(Punto41GUI.this,
                            "Debe ingresar un valor numérico",
                            "Error",
                            JOptionPane.ERROR_MESSAGE);
                    textField.setText("");
                }
            }
        });

        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Punto41GUI();
    }
}

