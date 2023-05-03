package Actividad3;
import java.util.ArrayList;
import java.util.Scanner;

public class Punto40 {
    static Integer num=0;
    static ArrayList<Integer> numbers = new ArrayList<Integer>();
    static Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Introduce números. El cero para salir ");

        do {
            num = myScanner.nextInt();
            numbers.add(num);
        } while (num!=0);


        for(int i = 0; i < numbers.size() -1; i++)
        {
            mathOperations(numbers.get(i));
        }
    }

    static void mathOperations(Integer number){
        double numSqrt = Math.sqrt(number);
        double cuadrado = Math.pow(number,2);
        double cubo= Math.pow(number,3);
        System.out.println(number + ": " +"Raiz cuadrada: "+ numSqrt+" Cuadrado: "+ cuadrado + " Cubo: "+ cubo );
    }


}
