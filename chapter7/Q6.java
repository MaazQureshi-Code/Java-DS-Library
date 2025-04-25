public class Q6 {
    
    public static void main(String[] args) {

        int[] fre = new int[10];


        for (int i = 0; i < 100; i++) {
            int random_Num = (int) (Math.random() * 10);

            fre[random_Num] += 1;
            

        }
        
        for (int i = 0; i < fre.length; i++) {
            System.out.println(i + " " + fre[i]);
        }
    }
}
