public class Circulo {

        int radio;
        Circulo(int radio) {
            this.radio = radio;
        }
        double calcularArea() {
            return Math.PI*Math.pow(radio,2);
        }

        double calcularPerímetro() {
            return 2*Math.PI*radio;
        }

}
