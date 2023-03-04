import java.util.Scanner;

public class NrFourteen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un número");
        double num = scanner.nextInt();
        double cuadrado = Math.pow(num,2);
        double cubo = Math.pow(num,3);
        System.out.println("El cuadrado de " + num + " es " + cuadrado);
        System.out.println("El cubo de " + num + " es " + cubo);
    }
}

