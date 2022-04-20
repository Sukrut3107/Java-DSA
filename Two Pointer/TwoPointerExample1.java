import java.util.Arrays;

public class TwoPointerExample1 {
    public static void main(String[] args) {
        int arr[] = {-8, -5, 1, 2, 4, 9};
        int n = arr.length;
        int i = 0;
        int j = n - 1;
        twoPointer1(arr, n, i, j);
    }
    public static void twoPointer1(int arr[],int n, int start,int end){
        n = arr.length;;
        start = 0;
        end = n-1;
        while (start<=end){
            if(arr[start]*arr[start]>arr[end]*arr[end]){
                System.out.print(arr[start]*arr[start]+" ");
                start = start +1;
            }
            System.out.print(arr[end]*arr[end]+" ");
            end = end - 1;
        }

    }
}
