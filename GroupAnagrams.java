import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] input = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> result = sol.groupAnagrams(input);
        System.out.println(result);
    }
}

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String key = new String(ch);
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
