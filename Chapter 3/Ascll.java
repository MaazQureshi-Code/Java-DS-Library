
import java.util.Scanner;

public class Ascll {

    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a ASCII a code:");

        int num = scanner.nextInt();


        char s = (char)num;

        System.err.println("The character for ASCII code"+num +" is " + s);



    }
    
}
