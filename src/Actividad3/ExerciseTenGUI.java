package Actividad3;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Dimension;

public class ExerciseTenGUI extends JFrame {

    private JLabel nameLabel, inscriptionLabel, heritageLabel, stratumLabel, resultLabel;
    private JTextField nameField, inscriptionField, heritageField, stratumField;
    private JButton calculateButton;

    public ExerciseTenGUI() {
        super("Payment of Tuition");

        // Crear etiquetas
        nameLabel = new JLabel("Student Name:");
        inscriptionLabel = new JLabel("Inscription Number:");
        heritageLabel = new JLabel("Heritage:");
        stratumLabel = new JLabel("Social Stratum:");
        resultLabel = new JLabel("");

        // Crear campos de texto
        nameField = new JTextField(20);
        inscriptionField = new JTextField(10);
        heritageField = new JTextField(10);
        stratumField = new JTextField(10);

        // Crear botón de cálculo
        calculateButton = new JButton("Calculate Payment");
        calculateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                int inscription = Integer.parseInt(inscriptionField.getText());
                int heritage = Integer.parseInt(heritageField.getText());
                int stratum = Integer.parseInt(stratumField.getText());

                double payment = paymentOfTuition(heritage, stratum);

                resultLabel.setText("The student with inscription number " + inscription + " and name " + name + " must pay: $" + payment);
            }
        });

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new BoxLayout(inputPanel, BoxLayout.Y_AXIS));
        inputPanel.add(nameLabel);
        inputPanel.add(nameField);
        inputPanel.add(inscriptionLabel);
        inputPanel.add(inscriptionField);
        inputPanel.add(heritageLabel);
        inputPanel.add(heritageField);
        inputPanel.add(stratumLabel);
        inputPanel.add(stratumField);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.Y_AXIS));
        buttonPanel.add(Box.createRigidArea(new Dimension(0, 20)));
        buttonPanel.add(calculateButton);
        buttonPanel.add(Box.createRigidArea(new Dimension(0, 20)));
        buttonPanel.add(resultLabel);

        getContentPane().add(inputPanel, "North");
        getContentPane().add(buttonPanel, "South");

        setSize(800, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static double paymentOfTuition(int heritage,int socialStratum){
        int constantValue =50000;
        if(heritage > 2000000 & socialStratum > 3){
            double totalPayment = constantValue + (heritage*0.03);
            return totalPayment;
        }else{
            return constantValue;
        }
    }

    public static void main(String[] args) {
        ExerciseTenGUI gui = new ExerciseTenGUI();
        gui.setVisible(true);
    }
}


