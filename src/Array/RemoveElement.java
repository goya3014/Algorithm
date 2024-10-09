package Array;

public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3};
        int val = 3;

        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index++] = nums[i];
            }
        }

        for (int j = 0; j < nums.length; j++) {
            System.out.print(nums[j] + " ");
        }
        System.out.println();

        //3 2 2 3 => 3 2 2 3, i = 0, index = 0
        //3 2 2 3 => 2 2 2 3, i = 1, index = 0 => 1
        //2 2 2 3 => 2 2 2 3, i = 2, index = 1 => 2
        //2 2 2 3 => 2 2 2 3, i = 3, index = 2

    }
}
