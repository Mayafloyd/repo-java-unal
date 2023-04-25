package Actividad1_2;

import java.util.Scanner;

public class NrFour {
    public static void main(String[] args) {
        Integer mama,juan,alberto,ana;

        System.out.println("Ingresa la edad de Juan");
        Scanner scanner = new Scanner(System.in);
        juan = scanner.nextInt();

        alberto = 2 * (juan/3);
        ana= 4*(juan/3);
        mama= juan+alberto+ana;

        System.out.println("Edad de Juan " + juan);
        System.out.println("Edad de Alberto " + alberto);
        System.out.println("Edad de Ana " + ana);
        System.out.println("Edad de mamá "+ mama);
    }
}
