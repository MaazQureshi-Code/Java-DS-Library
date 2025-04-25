
import java.util.Scanner;


public class area_pentagon {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);

        System.out.println("Enter the length form center to a vertex: ");

        double r = scanner.nextDouble();

        double s =  (2*r*Math.sin(3.14/5));

        double result = (5*s*s)/(4*Math.tan(3.14/5));

        
        System.out.printf("The area of pentagon %1.4f", result);
        
    }
    
}
