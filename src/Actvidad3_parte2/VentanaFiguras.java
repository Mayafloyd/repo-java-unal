package Actvidad3_parte2;

import Actividad1_2.Circulo;
import Actividad1_2.Cuadrado;
import Actividad1_2.Rectangulo;
import Actividad1_2.TrianguloRectangulo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaFiguras extends JFrame {
    public VentanaFiguras() {
        setTitle("Calculadora de Figuras");
        setSize(500, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Crear panel de entrada de parámetros
        JPanel inputPanel = new JPanel(new GridLayout(7, 2));

        // Crear campos de texto y etiquetas para parámetros
        JLabel lblRadio = new JLabel("Radio:");
        JTextField txtRadio = new JTextField();

        JLabel lblLado = new JLabel("Lado del cuadrado:");
        JTextField txtLado = new JTextField();

        JLabel lblBaseRect = new JLabel("Base rectángulo:");
        JTextField txtBaseRect = new JTextField();

        JLabel lblAlturaRect = new JLabel("Altura rectángulo:");
        JTextField txtAlturaRect = new JTextField();

        JLabel lblBaseTri = new JLabel("Base triángulo:");
        JTextField txtBaseTri = new JTextField();

        JLabel lblAlturaTri = new JLabel("Altura triángulo:");
        JTextField txtAlturaTri = new JTextField();

        // Añadir etiquetas y campos de texto al panel de entrada
        inputPanel.add(lblRadio);
        inputPanel.add(txtRadio);
        inputPanel.add(new JLabel());

        inputPanel.add(lblLado);
        inputPanel.add(txtLado);
        inputPanel.add(new JLabel());

        inputPanel.add(lblBaseRect);
        inputPanel.add(txtBaseRect);
        inputPanel.add(lblAlturaRect);
        inputPanel.add(txtAlturaRect);

        inputPanel.add(lblBaseTri);
        inputPanel.add(txtBaseTri);
        inputPanel.add(lblAlturaTri);
        inputPanel.add(txtAlturaTri);

        // Crear botones
        JButton btnCirculo = new JButton("Círculo");
        JButton btnRectangulo = new JButton("Rectángulo");
        JButton btnCuadrado = new JButton("Cuadrado");
        JButton btnTriangulo = new JButton("Triángulo");

        // Añadir eventos a botones
        btnCirculo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int radio = Integer.parseInt(txtRadio.getText());
                    Circulo figura1 = new Circulo(radio);
                    JOptionPane.showMessageDialog(null, "Área del círculo: " + figura1.calcularArea() +
                            "\nPerímetro del círculo: " + figura1.calcularPerímetro());
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Por favor, ingrese un valor válido para el radio.");
                }
            }
        });

        btnRectangulo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int base = Integer.parseInt(txtBaseRect.getText());
                    int altura = Integer.parseInt(txtAlturaRect.getText());
                    Rectangulo figura2 = new Rectangulo(base, altura);
                    JOptionPane.showMessageDialog(null, "Área del rectángulo: " + figura2.calcularArea() +
                            "\nPerímetro del rectángulo: " + figura2.calcularPerímetro());
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Por favor, ingrese valores válidos para la base y la altura.");
                }
            }
        });

        btnCuadrado.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int lado = Integer.parseInt(txtLado.getText());
                    Cuadrado figura3 = new Cuadrado(lado);
                    JOptionPane.showMessageDialog(null, "Área del cuadrado: " + figura3.calcularArea() +
                            "\nPerímetro del cuadrado: " + figura3.calcularPerímetro());
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Por favor, ingrese un valor válido para el lado.");
                }
            }
        });

        btnTriangulo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int base = Integer.parseInt(txtBaseTri.getText());
                    int altura = Integer.parseInt(txtAlturaTri.getText());
                    TrianguloRectangulo figura4 = new TrianguloRectangulo(base, altura);
                    JOptionPane.showMessageDialog(null, "Área del triángulo: " + figura4.calcularArea() +
                            "\nPerímetro del triángulo: " + figura4.calcularPerímetro());
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Por favor, ingrese valores válidos para la base y la altura.");
                }
            }
        });

        // Crear panel de botones y añadir botones
        JPanel buttonPanel = new JPanel(new GridLayout(2, 2));
        buttonPanel.add(btnCirculo);
        buttonPanel.add(btnRectangulo);
        buttonPanel.add(btnCuadrado);
        buttonPanel.add(btnTriangulo);

        // Añadir paneles a la ventana
        add(inputPanel, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        VentanaFiguras ventana = new VentanaFiguras();
        ventana.setVisible(true);
    }
}