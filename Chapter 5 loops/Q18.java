
import java.util.Scanner;

public class Q18 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double num = scanner.nextDouble();

        double n = 1;


        double result= 0;

        for (int i = 1; i <=num;i++) {

            result = result + (double)(1/n);
            n++;


        }

        System.out.println("The result " + result);
            

        scanner.close();
        
        
    }
}
