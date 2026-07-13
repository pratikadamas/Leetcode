
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        // Count frequencies of each number
        for (int e : nums) {
            map.put(e, map.getOrDefault(e, 0) + 1);
        }

        ArrayList<Integer> list = new ArrayList<>();
        
        // Fixed: changed KeySet() to keySet()
        for (int key : map.keySet()) {
            if (map.get(key) == 2) {
                list.add(key);
            }
        }

        return list;
    }
}
