import java.util.*;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> arr = new ArrayList<>();

        for (int num : nums1) arr.add(num);
        for (int num : nums2) arr.add(num);

        Collections.sort(arr); // must sort before finding median

        int n = arr.size();
        double ans;

        if (n % 2 != 0) {
            // odd length
            ans = arr.get(n / 2);
        } else {
            // even length
            ans = (arr.get(n / 2 - 1) + arr.get(n / 2)) / 2.0;
        }

        return ans;
    }
}
