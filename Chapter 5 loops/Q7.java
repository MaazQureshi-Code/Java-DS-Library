
import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number_of_Student = 1 ;
        String name_of_Student;
        int highest_score = 0;
        int second_highest = 0;

        while ( number_of_Student != -1) {
            System.out.println("Please enter the name of the student:");
            name_of_Student = scanner.nextLine();
            System.out.print("Please enter the marks of the student (or enter -1 to exit):");
            number_of_Student = scanner.nextInt();

            // scanner.nextLine(); // Consume the newline
            scanner.nextLine(); // Consume the newline
            System.out.println("Name " + number_of_Student + " Marks " + number_of_Student);

            /// this code for finding the second_highest secnond numbers
            if(number_of_Student > highest_score){
                second_highest = highest_score;
                highest_score = number_of_Student;
            
            } else if(number_of_Student > second_highest ){
                second_highest = number_of_Student;
            }
        }

        System.out.println("The max mark is + " + highest_score + "The second_highest is  " + second_highest);

        
            
        

    }
}
