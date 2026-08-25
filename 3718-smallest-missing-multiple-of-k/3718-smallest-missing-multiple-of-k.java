
class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int multiple = k;
        while (set.contains(multiple)) {
            multiple += k; // Generates k, 2k, 3k, 4k, ...
        }

        return multiple;
    }
}