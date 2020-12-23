//
//Given a non-empty string s, you may delete at most one character. Judge whethe
//r you can make it a palindrome.
// 
//
// Example 1: 
// 
//Input: "aba"
//Output: True
// 
// 
//
// Example 2: 
// 
//Input: "abca"
//Output: True
//Explanation: You could delete the character 'c'.
// 
// 
//
// Note: 
// 
// The string will only contain lowercase characters a-z.
//The maximum length of the string is 50000. 
// 
// Related Topics String 
// 👍 2179 👎 136

  
  package leetcode.editor.en;
  public class ValidPalindromeIi{
      public static void main(String[] args) {
           Solution solution = new ValidPalindromeIi().new Solution();
      }
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean validPalindrome(String s) {
      for (int i = 0, j = s.length() - 1; i < j; ++i, --j ) {
      	if (s.charAt(i) != s.charAt(j))
      	  return helperCheck(s, i + 1, j) || helperCheck(s, i, j - 1);
      }
    	return true;
    }

    public boolean helperCheck(String s, int i, int j) {
    	while (i < j) {
    		if (s.charAt(i++) != s.charAt(j--))
    			return false;
      }
    	return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }