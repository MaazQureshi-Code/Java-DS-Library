public class bubble_sort {


    public void sort(int [] arr){
        int n = arr.length;
        boolean isSwapped;
        for(int i =0; i < n -1;i++){
            isSwapped = false;
            for(int j = 0; j < n -1;j++){

                if(arr[j] > arr[j +1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    isSwapped = true;
                }
                if(isSwapped == false){break;}
            }
        }


    }
    public static void main(String[] args) {
        
    }
}
