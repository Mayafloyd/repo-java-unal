package Actividad3;

import javax.swing.*;
import java.awt.event.*;

public class ExerciseSeven_Cap4_GUI implements ActionListener {
    private JTextField inputA, inputB;
    private JLabel resultLabel;

    public ExerciseSeven_Cap4_GUI() {
        // Crear la ventana y los paneles
        JFrame frame = new JFrame("Comparación de variables");
        JPanel inputPanel = new JPanel();
        JPanel resultPanel = new JPanel();

        // Crear los componentes de entrada
        inputA = new JTextField(10);
        inputB = new JTextField(10);
        JButton compareButton = new JButton("Comparar");

        // Agregar los componentes de entrada al panel inputPanel
        inputPanel.add(new JLabel("Variable A: "));
        inputPanel.add(inputA);
        inputPanel.add(new JLabel("Variable B: "));
        inputPanel.add(inputB);
        inputPanel.add(compareButton);

        // Agregar el JLabel al panel resultPanel
        resultLabel = new JLabel(" ");
        resultPanel.add(resultLabel);

        // Agregar los paneles a la ventana
        frame.add(inputPanel, "North");
        frame.add(resultPanel, "Center");

        // Configurar el botón de comparación
        compareButton.addActionListener(this);

        // Configurar la ventana
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        // Obtener valores de entrada
        int variableA = Integer.parseInt(inputA.getText());
        int variableB = Integer.parseInt(inputB.getText());

        // Llamar al método MajorOrLess y mostrar el resultado
        MajorOrLess(variableA, variableB);
    }

    public void MajorOrLess(int a, int b) {
        if (a > b) {
            resultLabel.setText("A es mayor que B");
        } else if (a == b) {
            resultLabel.setText("A es igual que B");
        } else {
            resultLabel.setText("A es menor que B");
        }
    }

    public static void main(String[] args) {
        ExerciseSeven_Cap4_GUI gui = new ExerciseSeven_Cap4_GUI();
    }
}
