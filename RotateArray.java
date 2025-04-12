import java.util.Arrays;

public class RotateArray {

    public static int rotateArray(int[] nums, int k) {

        System.out.println(Arrays.toString(nums));

        int n = nums.length;
        k = k % n; // Maneja el caso donde k > n

        // Paso 1: Invertir todo el array
        reverse(nums, 0, n - 1);

        // Paso 2: Invertir los primeros k elementos
        reverse(nums, 0, k - 1);

        // Paso 3: Invertir los elementos restantes
        reverse(nums, k, n - 1);

        return k;

    }

    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        System.out.println(rotateArray(new int[] { 1, 2, 3, 4, 5, 6, 7 }, 3));
    }

}
