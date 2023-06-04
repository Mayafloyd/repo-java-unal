package Actividad4.ClaseAbstracta;

public class PruebaFraccion {
    public static void main(String[] args) {
        Fraccion fraccion1 = new Fraccion(1, 2);
        Fraccion fraccion2 = new Fraccion(3, 4);

        System.out.println("Fraccion 1: " + fraccion1.toString());
        System.out.println("Fraccion 2: " + fraccion2.toString());

        // Suma
        Numerica suma = fraccion1.sumar(fraccion2);
        System.out.println("Suma: " + suma.toString());

        // Resta
        Numerica resta = fraccion1.restar(fraccion2);
        System.out.println("Resta: " + resta.toString());

        // Multiplicación
        Numerica multiplicacion = fraccion1.multiplicar(fraccion2);
        System.out.println("Multiplicacion: " + multiplicacion.toString());

        // Division
        Numerica division = fraccion1.dividir(fraccion2);
        System.out.println("Division: " + division.toString());

        // Comprobación de igualdad
        System.out.println("¿Fraccion 1 es igual a Fraccion 2? " + fraccion1.equals(fraccion2));

        // Comprobación de igualdad con una nueva instancia de fracción con los mismos valores
        Fraccion fraccion3 = new Fraccion(1, 2);
        System.out.println("¿Fraccion 1 es igual a Fraccion 3? " + fraccion1.equals(fraccion3));
    }
}

