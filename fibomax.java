public class fibomax{
    public static int cariMax(int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        }

        int i = cariMax(arr, n - 1);

        return Math.max(arr[n - 1], i);
    }

    public static void main(String[] args) {
        int[] arr = {334,78,25,885,242,335,567};
        int n = arr.length;

        int max = cariMax(arr, n);
        System.out.println("Nilai maksimum dalam array adalah: " + max);
    }
}
