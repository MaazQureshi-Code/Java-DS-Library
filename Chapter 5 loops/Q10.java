public class Q10 {
    public static void main(String[] args) {


        for (int i = 33; i <= 126; i++) {
            // Print the ASCII character corresponding to the current value
            System.out.print((char) i + " ");
            
            // After printing 10 characters, move to the next line
            if ((i - 32) % 10 == 0) {
                System.out.println();
            }
        
        }
    }
}
