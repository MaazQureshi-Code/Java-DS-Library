
import java.util.Scanner;

public class Q9 {

    public static int[] eliminateDuplicates(int[] list) {
        if (list == null || list.length == 0) {
            return new int[0];
        }
        int temp[] = new int[list.length];
        int count_Unique = 0;
        for (int i = 0; i < list.length; i++) {
            boolean isDuplicate = false;

            for (int j = 0; j < count_Unique; j++) {
                if (list[i] == temp[j]) {
                    isDuplicate = true;
                }
            }

            if (!isDuplicate) {
                temp[count_Unique] = list[i];
                count_Unique++;
            }

        }
                    
            return temp;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int arr[] = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        
          // Eliminate duplicates
        int[] uniqueNumbers = eliminateDuplicates(arr);

        // Display the result
        System.out.print("The distinct numbers are: ");
        for (int num : uniqueNumbers) {
            System.out.print(num + " ");
        }
    }
}
