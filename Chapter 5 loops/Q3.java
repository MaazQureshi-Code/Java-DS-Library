
import java.util.Scanner;

public class Q3 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.err.println("Kilograms   Pounds");
        for(int kg = 1; kg <=199; kg += 2){

            double pound = kg * 2.2;

            System.out.printf("%-11d  %.1f%n" , kg , pound);

        }


    }
}
