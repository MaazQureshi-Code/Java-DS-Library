public class Question3 {
    public static void main(String[] args) {
        
    }

    public static int reverse(int number){

        int reverse = 0;
        while (number != 0) {

            number = number % 10;
            reverse = reverse * 10 + number;
            number /= 10;
            
        }

        return reverse;

    }
    public static boolean isPalindrome(int number) {
        return number == reverse(number);
    }

    
}
