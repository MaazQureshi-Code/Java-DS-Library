public class Q6 {
    public static void main(String[] args) {
        
        int count = 0; // Counter for prime numbers

        // Loop through numbers from 2 to 9999 (as 1 is not prime)
        for (int i = 2; i < 10000; i++) {
            if (isPrime(i)) {
                count++; // Increment the counter if the number is prime
            }
        }

        // Display the result
        System.out.println("The number of prime numbers less than 10,000 is: " + count);
        

    }


    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false; // 1 and numbers less than 1 are not prime
        }

        // Check divisors from 2 up to the square root of the number
        for (int divisor = 2; divisor <= Math.sqrt(number); divisor++) {
            if (number % divisor == 0) {
                return false; // Number is divisible by a divisor, so not prime
            }
        }

        return true; // Number is prime
    }

}
