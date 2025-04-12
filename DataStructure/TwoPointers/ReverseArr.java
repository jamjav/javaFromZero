package DataStructure.TwoPointers;

import java.util.Arrays;

public class ReverseArr {

    public static void main(String[] args) {

        // reverseArray(new int[] { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 });
        reverseArray(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 });

    }

    public static void reverseArray(int[] nums) {

        int len = nums.length;
        int k = len - 1;

        System.out.println(Arrays.toString(nums));

        for (int i = 0; i < k; i++) {
            int temp = nums[i];
            nums[i] = nums[k];
            nums[k] = temp;
            // i++;
            k--;

            System.out.println(Arrays.toString(nums));

        }

        // System.out.println(Arrays.toString(nums));

    }

}
