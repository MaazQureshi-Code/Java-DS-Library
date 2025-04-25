

public class Question {
    public static int getPentagona(int n ){

        int sum = 0;
        for(int i = 1; i <=n;i++)
        {


        sum += (i*(3*i - 1))/2;
        System.out.print(" " + sum);

        if(i % 10 == 0){
            System.out.println(" ");
        }

        }

        return sum;

    }
    public static void main(String[] args) {

        int num = 100;
        System.out.println("The Pentagone is the following " + getPentagona(num));
        
    }
}
