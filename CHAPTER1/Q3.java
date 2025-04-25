
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the side:");
        double hexagon = scanner.nextDouble();
        // This 0.5 in power mean it has root
        double result = ((3*Math.pow(3, 0.5))/2.0)*(Math.pow(hexagon, 2));
        System.out.println("The distance between the two points is "+result);
    }
}
