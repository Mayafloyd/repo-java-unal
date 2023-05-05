package Actividad1_2;

public class Rectangulo {
    int base;
    int altura;
    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public double calcularArea() {
        return base * altura;
    }

    public double calcularPerímetro() {
        return (2 * base) + (2 * altura);
    }
}
