import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LengthOfLongestSubsequence {

    public static void main(String args[]) {
        System.out.println(lengthOfLongestSubstring("abcabdabcd"));
    }

    // O(n*n)
    public int lengthOfLongestSubstring1(String s) {
        int maxLength = 0;
        for (int i=0; i<s.length(); i++) {
            StringBuilder currStr = new StringBuilder();
            for (int j=0; j<s.length(); j++) {
                if (currStr.indexOf(String.valueOf(s.charAt(j))) != -1) {
                    break;
                }
                currStr.append(s.charAt(j));
                maxLength = Math.max(maxLength, currStr.length());
            }
        }
        return maxLength;
    }

    // O(n) using Map
    public int lengthOfLongestSubstring2(String s) {
        int maxLength = 0;
        Map<Character, Integer> visited = new HashMap();
        for (int right=0, left = 0; right<s.length(); right++) {
            if (visited.containsKey(s.charAt(right)) &&
                    visited.get(s.charAt(right)) >= left) {
                left = visited.get(s.charAt(right)) + 1;
            }
            maxLength = Math.max(maxLength, right - left + 1);
            visited.put(s.charAt(right), right);
        }
        return maxLength;
    }

    // O(n) using indexOf from start
    public static int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        for (int right = 0, left = 0; right < s.length(); right++) {
            int indexOfLastAppearance = s.indexOf(s.charAt(right), left);
            if (indexOfLastAppearance != right) {
                left = indexOfLastAppearance + 1;
            }
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }

    // O(n) using Set
    public int lengthOfLongestSubstring3(String s) {
        Set<Character> set = new HashSet();
        int len = s.length(), i = 0, j = 0, ans = 0;
        while (i < len && j < len) {
            if (!set.contains(s.charAt(i))) {
                set.add(s.charAt(i));
                i++;
                ans = Math.max(ans, i - j);
            } else {
                set.remove(s.charAt(j));
                j++;
            }
        }
        return ans;
    }
}
