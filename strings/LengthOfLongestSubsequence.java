public class LengthOfLongestSubsequence {

    public static void main(String args[]) {
        System.out.println(lengthOfLongestSubstring(" "));
    }

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
}
