package Actividad1_2;

import java.util.Scanner;

public class NrSeventeen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el radio del circulo ");
        double radio = scanner.nextDouble();
        double areaC = Math.PI *  Math.pow(radio,2);
        double longitudC = 2 * Math.PI * radio;
        System.out.println("El área del círculo es "+ areaC);
        System.out.println("La longitud de la circunferencia es " + longitudC);
    }
}
