package Actividad1_2;

public class Cuadrado {

        int lado;

        public Cuadrado(int lado) {
            this.lado = lado;
        }

        public double calcularArea() {
            return lado*lado;
        }

        public double calcularPerímetro() {
            return (4*lado);
        }
}
