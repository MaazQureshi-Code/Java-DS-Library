
import java.util.Scanner;


public class Q1 {
    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);
        int countPos = 0;
        int countNag = 0;
        int counter = 0;
        double sum = 0;
        System.out.println("Enter an integer, the input ends if it is 0:");
        double num = scanner.nextInt();
        while(true){
            int number = scanner.nextInt();
            if (number == 0) {
                break; // Exit loop if the input is 0
            }
            // Update counts and total
            if (number > 0) {
                countPos++;
            } else if (number < 0) {
                countNag++;
            }
            sum += number;
            counter++;
        }


        if (counter == 0) {
            System.out.println("No numbers are entered except 0.");
        } else {
            double average = (double) sum / counter;

            // Display results
            System.out.println("The number of positives is " + countPos);
            System.out.println("The number of negatives is " + countNag);
            System.out.println("The total is " + sum);
            System.out.printf("The average is %.2f%n", average); // Format average to 2 decimal places
        }






        scanner.close();


    }
    
}
