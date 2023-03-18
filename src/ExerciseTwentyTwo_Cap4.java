import java.util.Scanner;

public class ExerciseTwentyTwo_Cap4 {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Input your name");
        String name = myScanner.nextLine();
        System.out.println("Input your basic hourly wage");
        double hourlyWage = myScanner.nextDouble();
        System.out.println("Input the number of hours worked per month");
        int hoursMonth = myScanner.nextInt();

        double monthlySalary = hourlyWage * hoursMonth;
        if(monthlySalary > 450000){
            System.out.println("name: "+ name);
        }else{
            System.out.println("name: "+ name + " and monthly salary: " + monthlySalary);
        }


    }


}
