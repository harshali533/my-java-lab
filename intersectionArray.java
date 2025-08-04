import java.util.*;

class intersectionArray {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < nums1.length; i++) {
            int current = nums1[i];
            boolean found = false;
            for (int j = 0; j < nums2.length; j++) {
                if (current == nums2[j]) {
                    found = true;
                    break;
                }
            }
            if (found && !result.contains(current)) {
                result.add(current);
            }
        }

        int[] res = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            res[i] = result.get(i);
        }

        return res;
    }
}
