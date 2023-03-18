import java.sql.SQLOutput;
import java.util.Scanner;

public class ExerciseTen_Cap4 {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);


        System.out.println("Input the student name");
        String studentName = myScanner.nextLine();


        System.out.println("Input the inscription numb");
        int inscriptionNumb = myScanner.nextInt();



        System.out.println("Input the heritage");
        int heritage = myScanner.nextInt();

        System.out.println("Input the social stratum");
        int socialStratum = myScanner.nextInt();

        System.out.println("El estudiante con número de inscripción " + inscriptionNumb + " Y nombre " + studentName + " debe pagar: $" + paymentOfTuition(heritage,socialStratum) );

    }

    public static double paymentOfTuition(int heritage,int socialStratum){
        int constantValue =50000;
        if(heritage > 2000000 & socialStratum > 3){
        double  totalPayment = constantValue + (heritage*0.03);
        return totalPayment;
        }else{
            return constantValue;
        }
    }



}
