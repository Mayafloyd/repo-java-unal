package Actividad3;

public class Employee18_Cap3 {
    public static void main(String args[]) {
        Employee18_Cap3 newEmployee = new Employee18_Cap3(
                "1010",
                "Sara Maya",
                192,
                25000,
                10.0
        );
        System.out.println("El código del empleado es: " + newEmployee.getCode());
        System.out.println("Los nombres del empleado son: " + newEmployee.getNames());
        System.out.println("El salario bruto del empleado es: " + newEmployee.getGrossSalary());
        System.out.println("El salario neto del empleado es: " + newEmployee.getNetSalary());
    }
    String code;
    String names;
    int numberOfWorkingHoursAtMonth;
    int costOfWorkingPerHour;
    double withholdingTaxPercentage;


    public Employee18_Cap3(String code,
                           String names,
                           int numberOfWorkingHoursAtMonth,
                           int costOfWorkingPerHour,
                           double withholdingTaxPercentage) {
        this.code = code;
        this.names = names;
        this.numberOfWorkingHoursAtMonth = numberOfWorkingHoursAtMonth;
        this.costOfWorkingPerHour = costOfWorkingPerHour;
        this.withholdingTaxPercentage = withholdingTaxPercentage;
    }


    public String getCode(){
        return code;
    }


    public String getNames(){
        return names;
    }


    public double getGrossSalary(){
        return numberOfWorkingHoursAtMonth * costOfWorkingPerHour;
    }


    public double getNetSalary(){
        double grossSalary = numberOfWorkingHoursAtMonth * costOfWorkingPerHour;
        double netSalary = grossSalary - (grossSalary * (withholdingTaxPercentage/100));
        return netSalary;
    }
}

