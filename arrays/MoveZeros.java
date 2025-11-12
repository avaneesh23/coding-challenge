public class MoveZeros {

    public static void main(String[] args) {
        int[] nums = moveZeroes(new int[] { 0,1,0,3,2});
        for (int i=0; i<nums.length; i++) {
            System.out.print(nums[i] +" ");
        }
    }

    public static int[] moveZeroes(int[] nums) {
        // move items by k
        int[] arr = new int[nums.length];

        int k=0;
        for (int i=0; i<nums.length; i++) {
            if (nums[i] != 0) {
                arr[k++] = nums[i]; 
            }
        }
        return arr;
    }

}
