
public class Q20 {
    public static void main(String[] args) {
        
        for (int i = 10000; i <= 100000; i += 10000) {
            double pi = 0.0;

            // Compute π for the current number of terms
            for (int k = 0; k < i; k++) {
                pi += Math.pow(-1, k) / (2 * k + 1);
            }

            pi *= 4; // Multiply the result by 4
            System.out.println("π approximation for i = " + i + " is: " + pi);
        }
    }
}
