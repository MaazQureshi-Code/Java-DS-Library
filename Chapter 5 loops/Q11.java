
import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner scanner = new  Scanner(System.in);

        System.out.println("PLease enter the numbers");
        int number = scanner.nextInt();

        System.out.print("The smallest factors of " + number + " are: ");
        
        // Find and print the smallest factors
        for (int i = 2; i <= number; i++) {
            // Check if i is a factor of the number
            while (number % i == 0) {
                System.out.print(i + " ");
                number /= i; // Divide the number by the factor i
            }
        }

    }
}
