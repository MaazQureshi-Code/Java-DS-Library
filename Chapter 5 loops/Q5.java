public class Q5 {
    public static void main(String[] args) {
        
        System.out.printf("%-12s  %-8s | %-8s %-12s%n","Miles","Kilometers","Kilometers","Miles");

        int kiloCount = 20;


        for (int mile = 1, kg = kiloCount; mile <= 20; mile +=2 , kiloCount += 5  ) {

            double m = mile * 1.609;

            double k = kg / 1.609;
            System.out.printf("%-12d  %-8.2f | %-8d %-12.2f%n",mile , m , kiloCount , k );
            
        }


    }
}
