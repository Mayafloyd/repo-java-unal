import java.util.Scanner;
public class ExerciseEleven_Cap4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el primer número:");
        double firstNum = sc.nextDouble();
        System.out.println("Ingrese el segundo número:");
        double secondNum = sc.nextDouble();
        System.out.println("Ingrese el tercer número: ");
        double thirdNum = sc.nextDouble();

        double greatestNumber = getGreatestNum(firstNum, secondNum, thirdNum);
        System.out.println("El mayor entre " + firstNum + ", " + secondNum + " y " + thirdNum + " es: " + greatestNumber);
    }

    public static double getGreatestNum(double num1, double num2, double num3){
        if(num1 > num2 && num1 > num3){
            return num1;
        }
        else if(num2 > num3){
            return num2;
        }
        else {
            return num3;
        }
    }
}
