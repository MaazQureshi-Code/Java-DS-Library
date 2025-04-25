
import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.err.print("Enter the first positive integer: ");
        int num = scanner.nextInt();
        System.out.println("Enter the second positive integer:");
        int num2 = scanner.nextInt();

        int d = Math.min(num, num2);

        int gcd = 1;



        for(int i = d; i >= 1;i--){
            if(num % i == 0 && num2 % i == 0){
                gcd = i;
                break;
            }
        }

        System.out.println("The greatest common divisir (GCD) of " + gcd);





    }
}
