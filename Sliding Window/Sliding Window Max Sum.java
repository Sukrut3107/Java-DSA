public class Sw1 {
    public static void main(String[] args) {
        int arr[] = {2,1,5,8,9,4,6};
        int k = 3;
        //bruteForce(arr,k);
        SlidingWindow(arr,k);


    }
    public static void bruteForce(int arr[], int k){
        int n = arr.length;
        for (int i = 0; i <= n-k; i++) {
            int sum = 0;
            for (int j = i; j <i+k ; j++) {
                sum +=arr[j];
            }
            System.out.println(sum);
        }

    }

    public static void SlidingWindow(int arr[], int k){
        int n = arr.length;
        int sum = 0;

        //first window we have to calculate manually
        // time compl. is O(k)
        for (int i = 0; i < k; i++) {
            sum +=arr[i];
        }
        System.out.println(sum);
        //time compl. is O(n-k)
        for (int i = 1; i < n-k+1; i++) {
            sum = sum - arr[i-1]+arr[k+i-1];
            System.out.println(sum);
        }
    }
}
