
   
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int nums [] = {2,0,1};
        Bubble(nums);
        System.out.println(Arrays.toString(nums));

    }
    static void Bubble(int arr[]){
        boolean swapped;
        //run the steps n-1 times
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            //for each step, max item will come at last respective index
            for (int j = 1; j < arr.length-i; j++) {
                //swap if the item is smaller than previous item
                if(arr[j]<arr[j-1]){
                //swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            //if you did not swapped for a perticular value of i,it means array is sorted hence program ends here.
            if(swapped == false){ //!swapped
                break;
            }
        }
    }
}
