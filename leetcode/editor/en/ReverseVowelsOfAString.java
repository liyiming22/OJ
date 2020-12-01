//Write a function that takes a string as input and reverse only the vowels of a
// string. 
//
// Example 1: 
//
// 
//Input: "hello"
//Output: "holle"
// 
//
// 
// Example 2: 
//
// 
//Input: "leetcode"
//Output: "leotcede" 
// 
//
// Note: 
//The vowels does not include the letter "y". 
//
// 
// Related Topics Two Pointers String 
// 👍 828 👎 1318

  
  package leetcode.editor.en;

import java.util.Arrays;
import java.util.HashSet;

public class ReverseVowelsOfAString{
      public static void main(String[] args) {
           Solution solution = new ReverseVowelsOfAString().new Solution();
      }
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    private final static HashSet<Character> vowels = new HashSet<>(
            Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
    public String reverseVowels(String s) {
        if (null == s)  return null;
        int i = 0, j = s.length() - 1;
        char[] res = new char[s.length()];
        while (i <= j) {
          char ci = s.charAt(i);
          char cj = s.charAt(j);
          if (!vowels.contains(ci)) {
            res[i++] = ci;
          } else if (!vowels.contains(cj)) {
            res[j--] = cj;
          } else {
            res[i++] = cj;
            res[j--] = ci;
          }
        }
        return new String(res);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }