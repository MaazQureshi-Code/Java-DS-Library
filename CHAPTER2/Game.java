
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = (int)(Math.random() *10);
        int number1 = (int)(Math.random() *10);
        System.err.println("What is the sum of this " + number + "+ " + number1);

        int guess = scanner.nextInt();

        int sum = number + number1;

        if(guess ==  sum){
            System.err.println("WOWOW it is correct");
        }else{
            System.out.println("wrong");
        }




        
        
    }
    
}
