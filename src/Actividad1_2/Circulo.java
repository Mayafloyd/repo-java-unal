package Actividad1_2;

public class Circulo {

        int radio;
        public Circulo(int radio) {
            this.radio = radio;
        }
        public double calcularArea() {
            return Math.PI*Math.pow(radio,2);
        }

        public double calcularPerímetro() {
            return 2*Math.PI*radio;
        }

}
