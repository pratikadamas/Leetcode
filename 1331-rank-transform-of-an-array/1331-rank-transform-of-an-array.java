class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n = arr.length;

        if (n == 0)
            return new int[0];

        HashMap<Integer, Integer> map = new HashMap<>();
        int[] temp = arr.clone();

        Arrays.sort(arr);

        int rank = 1;

        for (int i = 0; i < n; i++) {
            if (!map.containsKey(arr[i])) {
                map.put(arr[i], rank++);
            }
        }

        for (int i = 0; i < n; i++) {
            temp[i] = map.get(temp[i]);
        }

        return temp;
    }
}