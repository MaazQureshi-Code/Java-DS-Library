public class merage {

    public int[] merge(int[] arr,int[] arr2,int n,int m){
        int [] result = new int[n + m];

        int i = 0; // traverse arr1
        int j = 0; // traverse arr2
        int k = 0; // traverse result 

        while (i < n && j < n) {  // boundary condition
              
            if(arr[i] < arr[j]){ // if arr1 element at i  is less than arr2 element at j

                result[k] = arr[i];
                i++;

            }else{
                result[k] = arr[j];
            }

            k++;
        }

        while (i < n) {

            result[k] = result[i];
            k++;
            i++;
            
        }

        while(j < n){
            result[k] = result[j];
            k++;
            j++;
        }

        return  result;

    }
    public static void  main (String [] args){


    }
}
