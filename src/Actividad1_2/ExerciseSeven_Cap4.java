package Actividad1_2;

import java.util.Scanner;

public class ExerciseSeven_Cap4 {
    public static void main(String[] args) {

    Scanner myScanner = new Scanner(System.in);

    int variableA = myScanner.nextInt();
    int variableB = myScanner.nextInt();

    MajorOrLess(variableA,variableB);
    }

    public static void MajorOrLess(int a,int b){
        if(a>b){

           System.out.println("A es mayor que B ");
        } else if (a==b) {
            System.out.println("A es igual que B");
        }else{
            System.out.println("A es menor que B");
        }
    }

}
