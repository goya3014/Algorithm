package Array;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int idx = 1;

        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i] != nums[i+1]){
                nums[idx++] = nums[i+1];
            }
        }
        for (int x : nums){
            System.out.print(x + " ");
        }
        System.out.println("idx = " + idx);;
    }
}
