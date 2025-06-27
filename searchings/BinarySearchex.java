package searchings;

public class BinarySearchex {
    public static void main(String[] args) {
        int[] a = {2, 3, 4, 10, 40};
        int n = a.length;
        int x = 10; 
        int result = binarySearch(a, 0, n - 1, x);
        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }

    public static int binarySearch(int[] arr, int left, int right, int x) {
        if (right >= left) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == x) {
                return mid;
            }

            if (arr[mid] > x) {
                return binarySearch(arr, left, mid - 1, x);
            }

            return binarySearch(arr, mid + 1, right, x);
        }

        return -1;
    }
    public static int binarySearchIterative(int[] arr, int x) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == x) {
                return mid;
            }

            if (arr[mid] < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1; 
    }
}