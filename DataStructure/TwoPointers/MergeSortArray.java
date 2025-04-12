package DataStructure.TwoPointers;

import java.util.Arrays;

public class MergeSortArray {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int mIdx = m - 1;
        int nIdx = n - 1;
        int nums1Idx = n + m - 1;

        while (mIdx >= 0 && nIdx >= 0) {
            if (nums1[mIdx] > nums2[nIdx]) {
                nums1[nums1Idx] = nums1[mIdx];
                mIdx--;
            } else {
                nums1[nums1Idx] = nums2[nIdx];
                nIdx--;
            }
            nums1Idx--;
            System.out.println(Arrays.toString(nums1));
        }

        while (nIdx >= 0) {
            nums1[nums1Idx] = nums2[nIdx];
            nIdx--;
            nums1Idx--;
        }

    }

    public static void main(String[] args) {
        System.out.println("Merge Sort Array");
        int[] arr1 = new int[] { 1, 2, 3, 0, 0, 0 };
        merge(arr1, 3, new int[] { 2, 5, 6 }, 3);
        System.out.println(Arrays.toString(arr1));
    }

}
