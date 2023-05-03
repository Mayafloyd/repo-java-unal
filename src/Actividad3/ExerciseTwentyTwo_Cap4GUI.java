package Actividad3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ExerciseTwentyTwo_Cap4GUI {

    private JFrame frame;
    private JLabel nameLabel, wageLabel, hoursLabel, salaryLabel;
    private JTextField nameField, wageField, hoursField, salaryField;
    private JButton calculateButton;

    public ExerciseTwentyTwo_Cap4GUI() {

        // Create the frame and set its properties
        frame = new JFrame("Monthly Salary Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 400);
        frame.setLayout(new GridLayout(5, 2));

        // Create the labels and fields for user input
        nameLabel = new JLabel("Name:");
        nameField = new JTextField();
        wageLabel = new JLabel("Basic hourly wage:");
        wageField = new JTextField();
        hoursLabel = new JLabel("Number of hours worked per month:");
        hoursField = new JTextField();

        // Create the label for output and make it non-editable
        salaryLabel = new JLabel();
        salaryLabel.setText("Monthly salary:");
        salaryField = new JTextField();
        salaryField.setEditable(false);

        // Create the button to calculate the salary and add an action listener to it
        calculateButton = new JButton("Calculate Salary");
        calculateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Get the user input from the text fields
                String name = nameField.getText();
                double hourlyWage = Double.parseDouble(wageField.getText());
                int hoursMonth = Integer.parseInt(hoursField.getText());

                // Calculate the monthly salary
                double monthlySalary = hourlyWage * hoursMonth;

                // Display the salary in the output field
                if (monthlySalary > 450000) {
                    salaryField.setText("Name: " + name);
                } else {
                    salaryField.setText("Name: " + name + " and monthly salary: " + monthlySalary);
                }
            }
        });

        // Add the components to the frame
        frame.add(nameLabel);
        frame.add(nameField);
        frame.add(wageLabel);
        frame.add(wageField);
        frame.add(hoursLabel);
        frame.add(hoursField);
        frame.add(salaryLabel);
        frame.add(salaryField);
        frame.add(calculateButton);

        // Make the frame visible
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new ExerciseTwentyTwo_Cap4GUI();
    }
}
