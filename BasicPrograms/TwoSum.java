/*Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1] */
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    
    public static void main(String[] args) {
        
    }

    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> hm = new HashMap<Integer, Integer>();

        for(int i = 0; i < nums.length; i++){
            int complement = target - nums[i];
            if(hm.containsKey(complement)){
                return new int[]{hm.get(complement), i};
            }else{
                hm.put(nums[i], i);
            }
        }
        return null;
    }
}