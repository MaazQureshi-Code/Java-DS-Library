
import java.util.Scanner;

public class Q8 {
    public static int gcd(int a, int b) {
        
        while (b != 0) {

            int temp = b;

            b = a % b;
            a = temp;

        }
        

        return a;

    }
    
    public static int gcd(int... numbers) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("At least one number is required.");
        }

        int result = numbers[0]; // Start with the first number
        for (int i = 1; i < numbers.length; i++) {
            result = gcd(result, numbers[i]); // Compute GCD of current result and next number
            if (result == 1) {
                break; // GCD cannot be smaller than 1, so we can stop early
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Double arr[] = new Double[10];
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextDouble();
        }


    }
}
