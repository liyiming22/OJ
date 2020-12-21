//Given an integer array nums, find the contiguous subarray (containing at least
// one number) which has the largest sum and return its sum. 
//
// Follow up: If you have figured out the O(n) solution, try coding another solu
//tion using the divide and conquer approach, which is more subtle. 
//
// 
// Example 1: 
//
// 
//Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
//Output: 6
//Explanation: [4,-1,2,1] has the largest sum = 6.
// 
//
// Example 2: 
//
// 
//Input: nums = [1]
//Output: 1
// 
//
// Example 3: 
//
// 
//Input: nums = [0]
//Output: 0
// 
//
// Example 4: 
//
// 
//Input: nums = [-1]
//Output: -1
// 
//
// Example 5: 
//
// 
//Input: nums = [-2147483647]
//Output: -2147483647
// 
//
// 
// Constraints: 
//
// 
// 1 <= nums.length <= 2 * 104 
// -231 <= nums[i] <= 231 - 1 
// 
// Related Topics Array Divide and Conquer Dynamic Programming 
// 👍 9962 👎 479

  
  package leetcode.editor.en;
  public class MaximumSubarray{
      public static void main(String[] args) {
           Solution solution = new MaximumSubarray().new Solution();
      }
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maxSubArray(int[] nums) {
    	if (1 == nums.length) return nums[0];
    	int last_max = Integer.MIN_VALUE;
    	int curr_max = 0;
    	for (var curr : nums) {
    	  curr_max = Math.max(curr_max + curr, curr);
    	  if (curr_max > last_max)	last_max = curr_max;
      }
    	return last_max;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }