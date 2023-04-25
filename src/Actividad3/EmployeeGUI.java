package Actividad3;

import javax.swing.*;

public class EmployeeGUI extends JFrame {

    private JLabel codeLabel, nameLabel, hoursLabel, costLabel, taxLabel;
    private JTextField codeTextField, nameTextField, hoursTextField, costTextField, taxTextField;
    private JButton calculateButton;
    private JTextArea resultTextArea;

    public EmployeeGUI() {
        // Configurar la ventana
        setTitle("Calculadora de Salario de Empleado");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear los componentes de la GUI
        codeLabel = new JLabel("Código: ");
        nameLabel = new JLabel("Nombre: ");
        hoursLabel = new JLabel("Horas Trabajadas: ");
        costLabel = new JLabel("Costo por Hora: ");
        taxLabel = new JLabel("Porcentaje de Retención: ");

        codeTextField = new JTextField(10);
        nameTextField = new JTextField(10);
        hoursTextField = new JTextField(10);
        costTextField = new JTextField(10);
        taxTextField = new JTextField(10);

        calculateButton = new JButton("Calcular");
        calculateButton.addActionListener(e -> calcularSalario());

        resultTextArea = new JTextArea(5, 20);
        resultTextArea.setEditable(false);

        // Configurar el diseño
        JPanel panel = new JPanel();
        GroupLayout layout = new GroupLayout(panel);
        panel.setLayout(layout);
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        layout.setHorizontalGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addComponent(codeLabel)
                        .addComponent(nameLabel)
                        .addComponent(hoursLabel)
                        .addComponent(costLabel)
                        .addComponent(taxLabel)
                        .addComponent(calculateButton))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(codeTextField)
                        .addComponent(nameTextField)
                        .addComponent(hoursTextField)
                        .addComponent(costTextField)
                        .addComponent(taxTextField)
                        .addComponent(resultTextArea))
        );

        layout.setVerticalGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(codeLabel)
                        .addComponent(codeTextField))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(nameLabel)
                        .addComponent(nameTextField))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(hoursLabel)
                        .addComponent(hoursTextField))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(costLabel)
                        .addComponent(costTextField))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(taxLabel)
                        .addComponent(taxTextField))
                .addComponent(calculateButton)
                .addComponent(resultTextArea)
        );

        // Agregar el panel a la ventana
        add(panel);

        // Hacer visible la ventana
        setVisible(true);
    }

    private void calcularSalario() {
        // Obtener los valores de entrada
        String code = codeTextField.getText();
        String name = nameTextField.getText();
        int hours = Integer.parseInt(hoursTextField.getText());
        int cost = Integer.parseInt(costTextField.getText());
        double tax = Double.parseDouble(taxTextField.getText());

        // Crear el objeto Employee18_Cap3
        Employee18_Cap3 employee = new Employee18_Cap3(code, name, hours, cost, tax);

        // Calcular el salario neto
        double netSalary = employee.getNetSalary();

        // Mostrar el resultado en la GUI
        resultTextArea.setText("El salario neto del empleado es: " + netSalary);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new EmployeeGUI());
    }
}

