package Actividad4.MetodosAbstractos;
import javax.swing.JOptionPane;

public class FigurasGeometricas {
    public static abstract class FiguraGeometrica {
        protected double area;

        public abstract void calcularArea();

        public abstract void mostrarArea();
    }

    public static class CirculoFigura extends FiguraGeometrica {
        private double radio;

        public CirculoFigura(double radio) {
            this.radio = radio;
        }

        public void calcularArea() {
            area = Math.PI * Math.pow(radio, 2);
        }

        public void mostrarArea() {
            JOptionPane.showMessageDialog(null, "El área del círculo es: " + area);
        }
    }

    public static class RectanguloFigura extends FiguraGeometrica {
        private double base;
        private double altura;

        public RectanguloFigura(double base, double altura) {
            this.base = base;
            this.altura = altura;
        }

        public void calcularArea() {
            area = base * altura;
        }

        public void mostrarArea() {
            JOptionPane.showMessageDialog(null, "El área del rectángulo es: " + area);
        }
    }

    public static class CuadradoFigura extends FiguraGeometrica {
        private double lado;

        public CuadradoFigura(double lado) {
            this.lado = lado;
        }

        public void calcularArea() {
            area = Math.pow(lado, 2);
        }

        public void mostrarArea() {
            JOptionPane.showMessageDialog(null, "El área del cuadrado es: " + area);
        }
    }

    public static class Triangulo extends FiguraGeometrica {
        protected double base;
        protected double altura;

        public Triangulo(double base, double altura) {
            this.base = base;
            this.altura = altura;
        }

        public void calcularArea() {
            area = (base * altura) / 2;
        }

        public void mostrarArea() {
            JOptionPane.showMessageDialog(null, "El área del triángulo es: " + area);
        }
    }

    public static class TrianguloRectangulo extends Triangulo {
        public TrianguloRectangulo(double base, double altura) {
            super(base, altura);
        }

        public void mostrarArea() {
            JOptionPane.showMessageDialog(null, "El área del triángulo rectángulo es: " + area);
        }
    }

    public static void main(String[] args) {
        // Crear un objeto CirculoFigura
        double radio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el radio del círculo:"));
        CirculoFigura circulo = new CirculoFigura(radio);
        circulo.calcularArea();
        circulo.mostrarArea();

        // Crear un objeto RectanguloFigura
        double base = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la base del rectángulo:"));
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura del rectángulo:"));
        RectanguloFigura rectangulo = new RectanguloFigura(base, altura);
        rectangulo.calcularArea();
        rectangulo.mostrarArea();

        // Crear un objeto CuadradoFigura
        double lado = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el lado del cuadrado:"));
        CuadradoFigura cuadrado = new CuadradoFigura(lado);
        cuadrado.calcularArea();
        cuadrado.mostrarArea();

        // Crear un objeto TrianguloRectangulo
        base = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la base del triángulo:"));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura del triángulo:"));
        TrianguloRectangulo trianguloRectangulo = new TrianguloRectangulo(base, altura);
        trianguloRectangulo.calcularArea();
        trianguloRectangulo.mostrarArea();
    }
}
