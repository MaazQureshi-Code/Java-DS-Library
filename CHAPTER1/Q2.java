import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new  Scanner(System.in);
        double celsius,fahrenheit;
        System.out.println("Enter a degree in celsius:");
        celsius = scanner.nextDouble();
        fahrenheit = (9.0/5.0) * celsius +32;
        System.out.println(celsius +" Celsius is "+fahrenheit+" Fahrenhait");

        scanner.close();



     
    }
}
