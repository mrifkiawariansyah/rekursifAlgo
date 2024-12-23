public class fiboarray {
    public static boolean search(int[] arr, int n, int target){
        if (n == 0) {
            return false;
        }
        if (arr[n -1] == target) {
            return true;
        }
        return search(arr,n - 1, target);
    }
    public static void main(String[] args) {
        int[] arr = {54, 11, 987, 301, 656};
        int target = 656;
        boolean found = search(arr, arr.length, target);
        if(found == true) {
            System.out.println("Angka '"+target+"' ada di dalam array.");
        }else{
            System.out.println("Angka tidak ada di dalam array.");
        }
    }
}
