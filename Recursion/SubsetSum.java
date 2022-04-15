public class SubsetSum {
    public static void main(String[] args) {
        int arr [] = { 3, 34, 4, 12, 5, 2 };
        int n = arr.length-1;
        int k = 14;

        System.out.println(isSubSet(arr,n,k));
    }
    public static boolean isSubSet(int A[], int n, int k){
            if(k==0) return true;
            if(n<0 || k< 0) return false;

            boolean inc = isSubSet(A,n-1,k-A[n]);
            boolean exc = isSubSet(A,n-1,k);

            return inc || exc;

    }
}
