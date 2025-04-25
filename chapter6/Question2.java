public class Question2 {
    public static void main(String[] args) {
        System.err.println("The sum of Digits is " + sumDigits(234));
        
    }

    public static int sumDigits(int numbers){
        int sum = 0;
        while (numbers != 0) {

            int x = numbers % 10;
            sum += x;
            numbers /= 10; 
        }

        return sum;

    }
}
