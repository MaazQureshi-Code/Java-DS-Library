
import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int correctCount = 0;

        long startTime = System.currentTimeMillis();

    

        for(int i = 1; i<=10;i++){
            int num1 = 1 + (int)(Math.random()*15);
            int num2 = 1 + (int)(Math.random()*15);
    
            System.out.println("Question" + i + ": what is " + num1 + " + " + num2 + "?");
            int answer = scanner.nextInt();

            if(answer == num1+num2){
                System.err.println("Correct!");
                correctCount++;
            }else{
                System.err.println("Wrong. The correct answer is " + (num1+num2));
            }


        }



        long endTime = System.currentTimeMillis();

        long testTime = (endTime - startTime) / 1000; // Convert millisecond to  seconds

        System.err.println("\nYou got " + correctCount + " out of 10 questions correct. ");
        System.err.println("Total time taken: " + testTime + " seconds.");


        


        



        
    }
}
