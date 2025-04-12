package DataStructure.TwoPointers;

import java.util.Arrays;

public class RemoveSomeDuplicates {

    public static int removeDuplicates(int[] nums) {

        if (nums.length == 0)
            return 0;

        int write = 2;

        for (int read = 2; read < nums.length; read++) {
            if (nums[write - 2] != nums[read]) {
                nums[write] = nums[read];
                write++;

            }

            System.out.println(Arrays.toString(nums) + " write: " + write + " read: " + read);
        }
        return write + 1;
    }

    public static void main(String[] args) {
        removeDuplicates(new int[] { 1, 1, 1, 1, 1, 1, 2, 2, 3, 4, 4, 4, 7, 8, 8, 8 });
    }

}
