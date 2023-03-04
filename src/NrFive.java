import java.util.Scanner;

public class NrFive {
    public static void main(String[] args) {
      Integer x,y;
      int suma = 0;

      System.out.println("Ingrese el valor de x");
      Scanner scanner = new Scanner(System.in);
      x = scanner.nextInt();

      suma = suma + x;

      System.out.println("Ingrese el valor de y");
      y = scanner.nextInt();

     x = x+ (y*y);
     double cociente;
     cociente= suma +(double) x/y;
     System.out.println("El valor de la suma es: " + cociente);


    }
}
