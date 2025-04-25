

public class second_MAx{
    public static void main(String[] args) {
        int [] array = {4,5,2,6};
        int result = findSecondMax(array);
        System.out.println(result);
        
    }


    public static int findSecondMax(int [] array){
        int max = Integer.MIN_VALUE;
        int SecondMax = Integer.MIN_VALUE;

        for(int i = 0; i < array.length;i++){
            if(array[i] > max){
                SecondMax = max;
                max = array[i];
            }else if (array[i] > SecondMax && array[i] != max) {
                SecondMax = array[i];
                
            }
        }
    
    
        return SecondMax;
}
}