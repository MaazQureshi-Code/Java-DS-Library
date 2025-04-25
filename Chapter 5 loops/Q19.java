public class Q19 {
    public static void main(String[] args) {


        double result = 0;

        int n1 = 1;
        int n2 = 3;




        for(int i = 1,j = 3;i <= 97;i+= 2,j += 2){

            result += (double)i/j;

        }

        System.err.println("The result is " + result);
        
    }
}
