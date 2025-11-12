public class MinPositiveNumber {

    public int firstMissingPositive(int[] nums) {
        if (nums == null || nums.length == 0) return 1;

        int smallestPos = 1;
        while (contains(smallestPos, nums)) {
            smallestPos++;
        }
        return smallestPos;
        
    }

    boolean contains(int target, int[] nums) {
        for (int num: nums) {
            if (target == num) {
                return true;
            }
        }
        return false;
    }
}
