//Given a non-negative integer c, decide whether there're two integers a and b s
//uch that a2 + b2 = c. 
//
// 
// Example 1: 
//
// 
//Input: c = 5
//Output: true
//Explanation: 1 * 1 + 2 * 2 = 5
// 
//
// Example 2: 
//
// 
//Input: c = 3
//Output: false
// 
//
// Example 3: 
//
// 
//Input: c = 4
//Output: true
// 
//
// Example 4: 
//
// 
//Input: c = 2
//Output: true
// 
//
// Example 5: 
//
// 
//Input: c = 1
//Output: true
// 
//
// 
// Constraints: 
//
// 
// 0 <= c <= 231 - 1 
// 
// Related Topics Math 
// 👍 605 👎 357

  
  package leetcode.editor.en;
  public class SumOfSquareNumbers{
      public static void main(String[] args) {
           Solution solution = new SumOfSquareNumbers().new Solution();
      }
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean judgeSquareSum(int c) {
    	if (0 > c)  return false;
    	int i = 0, j = (int) Math.sqrt(c);
    	while (i <= j) {
    	  int powSum = i * i + j * j;
    	  if (c == powSum)	return true;
    	  else if (c < powSum) {
    	  	--j;
				} else {
    	  	++i;
				}
      }
    	return false;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }