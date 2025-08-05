public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] index = new int[128]; // ASCII size

        int max = 0;
        int left = 0;

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            left = Math.max(index[c], left); // skip the last occurrence of the current character
            max = Math.max(max, right - left + 1); // update max length
            index[c] = right + 1; // store the next position (right + 1) of the current character
        }

        return max;
    }
}
public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String input = "abcabcbb";
        int result = sol.lengthOfLongestSubstring(input);
        System.out.println("Length of Longest Substring Without Repeating Characters: " + result);
    }
}
