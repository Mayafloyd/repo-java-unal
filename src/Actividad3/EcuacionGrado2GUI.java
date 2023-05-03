package Actividad3;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EcuacionGrado2GUI extends JFrame implements ActionListener {

    private JTextField aField, bField, cField;
    private JLabel resultadoLabel;

    public EcuacionGrado2GUI() {
        setTitle("Ecuación de segundo grado");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);

        JLabel aLabel = new JLabel("A:");
        aField = new JTextField(5);
        JLabel bLabel = new JLabel("B:");
        bField = new JTextField(5);
        JLabel cLabel = new JLabel("C:");
        cField = new JTextField(5);


        JButton calcularButton = new JButton("Calcular");
        calcularButton.addActionListener(this);

        resultadoLabel = new JLabel();

        JPanel formPanel = new JPanel(new GridLayout(4, 2));
        formPanel.add(aLabel);
        formPanel.add(aField);
        formPanel.add(bLabel);
        formPanel.add(bField);
        formPanel.add(cLabel);
        formPanel.add(cField);
        formPanel.add(new JLabel());
        formPanel.add(calcularButton);

        setLayout(new BorderLayout());
        add(formPanel, BorderLayout.CENTER);
        add(resultadoLabel, BorderLayout.SOUTH);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Obtener los valores de A, B y C ingresados por el usuario
        double A = Double.parseDouble(aField.getText());
        double B = Double.parseDouble(bField.getText());
        double C = Double.parseDouble(cField.getText());

        // Calcular el discriminante y las soluciones de la ecuación
        double discriminante = Math.pow(B, 2) - 4 * A * C;
        if (discriminante < 0) {
            resultadoLabel.setText("La ecuación no tiene solución");
        } else if (discriminante > 0) {
            double solucion1 = (-B + Math.sqrt(discriminante)) / (2 * A);
            double solucion2 = (-B - Math.sqrt(discriminante)) / (2 * A);
            resultadoLabel.setText(String.format("Las soluciones de la ecuación son: %.2f y %.2f", solucion1, solucion2));
        } else {
            double solucion = -B / (2 * A);
            resultadoLabel.setText(String.format("La solución de la ecuación es: %.2f", solucion));
        }
    }

    public static void main(String[] args) {
        EcuacionGrado2GUI gui = new EcuacionGrado2GUI();
        gui.setVisible(true);
    }
}
