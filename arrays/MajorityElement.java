import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    
    public int majorityElement(int[] nums) {
        int maxCount = 0, majorityElement = -1;
        Map<Integer, Integer> count = new HashMap<>();
        for (int i=0; i<nums.length; i++) {
            count.put(nums[i], count.getOrDefault(nums[i], 0)+1);
            if (count.get(nums[i]) > nums.length/2) {
                maxCount = count.get(nums[i]);
                majorityElement = nums[i];
                break;
            }
        }
        return majorityElement;
    }
}
