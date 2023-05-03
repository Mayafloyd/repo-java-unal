package Actividad3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Punto40GUI {
    static ArrayList<Integer> numbers = new ArrayList<Integer>();
    static JFrame frame;
    static JPanel panel;
    static JLabel label1;
    static JTextField textField;
    static JButton button;
    static JTextArea textArea;

    public static void main(String[] args) {
        frame = new JFrame("Punto40");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
        label1 = new JLabel("Introduce números. El cero para finalizar la lista ");
        textField = new JTextField(10);
        button = new JButton("Agregar");
        textArea = new JTextArea(10, 20);
        textArea.setEditable(false);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int num = Integer.parseInt(textField.getText());
                if (num == 0) {
                    textField.setText("");
                    button.setEnabled(false);
                    for(int i = 0; i < numbers.size() ; i++)
                    {
                        mathOperations(numbers.get(i));
                    }
                } else {
                    numbers.add(num);
                    textArea.append(num + "\n");
                    textField.setText("");
                }
            }
        });

        panel.add(label1);
        panel.add(textField);
        panel.add(button);
        panel.add(textArea);
        frame.getContentPane().add(panel);
        frame.setVisible(true);
    }

    static void mathOperations(Integer number){
        double numSqrt = Math.sqrt(number);
        double cuadrado = Math.pow(number,2);
        double cubo= Math.pow(number,3);
        String resultado = number + ": " +"Raiz cuadrada: "+ numSqrt+" Cuadrado: "+ cuadrado + " Cubo: "+ cubo;
        textArea.append(resultado + "\n");
    }
}
