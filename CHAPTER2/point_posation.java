
import java.util.Scanner;

public class  point_posation{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.err.println("Enter three [pints for p0, p1, and p2:");

        double x0 = scanner.nextDouble();
        double y0 = scanner.nextDouble();
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        double determinat = (x1-x0)*(y2-y0)-(x2-x0)*(y1-y0);

        String beg = "(" +x2+", "+ y2+")  is";

        String end = " line from " + "(" + x0 + "," + y0 + ") to " + "(" + x1 + "," + y1 + ")";
        String det = "";

        if(determinat> 0){
            det += "on the right side of the";

        }else if(determinat == 0){
            
            det += "on the same line as the";

        } else {
            System.out.println("Something went wrong...");
            System.exit(0);
        }

        System.out.println(beg + det + end);
        scanner.close();

    }

}