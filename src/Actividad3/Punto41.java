package Actividad3;

import java.util.ArrayList;
import java.util.Scanner;

public class Punto41 {
    static Integer num=0;
    static ArrayList<Integer> numbers = new ArrayList<Integer>();
    static Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Introduce números. El cero para salir ");

        do {
            num = myScanner.nextInt();
            numbers.add(num);
        } while (num!=0);

        int numeroMax=0;
        for(int i = 0; i < numbers.size() -1; i++)
        {
            if(numbers.get(i) > numeroMax){
                numeroMax= numbers.get(i);
            }
        }
        System.out.println("Número mayor: "+ numeroMax );
    }


}
