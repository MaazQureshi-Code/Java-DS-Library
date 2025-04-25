
import java.util.Scanner;

public class Q3 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.err.println("Kilograms   Pounds");
        for(int i = 1; i <=199;i += 2){

            double pound = i * 2.20462;

            System.err.println(i + "  " + pound);

        }


    }
}
