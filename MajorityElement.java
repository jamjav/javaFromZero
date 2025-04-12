public class MajorityElement {

    public static int majorityElement(int[] nums) {
        int candidate = 0, count = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
            System.out.println("count: " + count + " candidate: " + candidate);
        }

        return candidate;
    }

    public static void main(String[] args) {
        System.out.println(majorityElement(new int[] { 0, 0, 0, 2, 2, 1, 1, 1, 2, 2, 2, 2 }));
    }

}
