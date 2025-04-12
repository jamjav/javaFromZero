package DataStructure.TwoPointers;

import java.util.Arrays;

public class RemoveDuplicates {

    public static int removeDuplicates(int[] nums) {

        if (nums.length == 0)
            return 0;

        int slow = 0;

        for (int fast = 1; fast < nums.length; fast++) {
            if (nums[fast] != nums[slow]) {
                slow++;
                nums[slow] = nums[fast];
            }
            System.out.println(Arrays.toString(nums) + " slow: " + slow + " fast: " + fast);
        }
        return slow + 1;
    }

    public static void main(String[] args) {
        removeDuplicates(new int[] { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 });
    }

}
