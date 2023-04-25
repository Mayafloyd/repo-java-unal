package Actividad1_2;

import java.util.Scanner;

public class NrTwelve {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer hora = 5000;
        System.out.println("Ingrese el número de horas trabajadas ");
        Integer horasSemanales = scanner.nextInt();
        Integer salarioBruto = horasSemanales * hora;
        double retencion = salarioBruto * (0.125);
        double salarioNeto = salarioBruto - retencion;
        System.out.println("Salario bruto "+ salarioBruto);
        System.out.println("Retención en la fuente " +  retencion);
        System.out.println("Salario neto " + salarioNeto);
    }
}
