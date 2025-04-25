
import java.util.Scanner;

public class Q21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.err.println("Enter you amount ");
        double num = scanner.nextInt();
        System.out.println("Enter amount months");
        double num2 = scanner.nextInt();

        num2 = (num /100)/12;

        double result = 0;

        for(int i = 1; i <= 6;i++){


            result += num * (1 + num2);




        }

        System.err.println("The result is " + result);





    }
}
