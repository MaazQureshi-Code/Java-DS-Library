
import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter the number of lines: ");

        int lines = scanner.nextInt();
        
        // Check if the input is within the valid range
        if (lines < 1 || lines > 15) {
            System.out.println("Please enter a number between 1 and 15.");
            return;
        }

        // Calculate the width of the last row
        int maxWidth = 2 * lines - 1;

        // Loop through each row
        for (int i = 1; i <= lines; i++) {
            // Calculate the number of spaces before the numbers in this row
            int spaces = lines - i;

            // Print leading spaces for alignment
            for (int j = 1; j <= spaces; j++) {
                System.out.print("  ");
            }

            // Print descending numbers
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }

            // Print ascending numbers after 1
            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }

            // Move to the next line after each row
            System.out.println();
        }
        

    }
}
