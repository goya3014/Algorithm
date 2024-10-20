package Array;

public class ValidMountainRef {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5,6,7,8,9};

        System.out.println(validMountainArray(arr));

    }
    public static boolean validMountainArray(int[] arr) {
        //edge case
        if (arr.length < 3) return false;

        //initialize 2 pointers
        int left = 0;
        int right = arr.length - 1;

        //move left pointer until it reaches a peek
        while (left < arr.length - 1 && arr[left] < arr[left + 1]) {
            left++;
        }

        //move right pointer until it reaches a peek
        while (right > 0 && arr[right] < arr[right - 1]) {
            right--;
        }

        //if left pointer is at the beginning or right pointer is at the end, then it's not a valid mountain array
        if (left == 0 || right == arr.length - 1) return false;

        //if left pointer is not equal to right pointer, it's not a valid mountain array.
        return left == right;
    }

}
