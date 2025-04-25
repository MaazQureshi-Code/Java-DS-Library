
import java.util.Scanner;
public class  quadratic{
    public  static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double a,b,c;
        System.out.println("Enter values for a b , and c now:");
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();

        double discriminant = (b*b) - (4*a*c);

        if(discriminant < 0){
            System.out.println("The discriminate is negative, The equation has real roots");
        }else if(discriminant > 0){
            
            double r1 = ((-1 * b) + Math.pow(discriminant, 0.5))/(2 * a);
            double r2 = ((-1 * b) - Math.pow(discriminant, 0.5))/(2 * a);
        }else{
            double r = ((-1 * b) + Math.pow(discriminant, 0.5)) / (2 * a);
            System.out.print("One real root: " + r);
        }
        scanner.close();

    }

}