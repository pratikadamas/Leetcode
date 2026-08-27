class Solution {
    public int magicalString(int n) {
        if (n <= 0) return 0;
        if (n <= 3) return 1;

        StringBuilder s = new StringBuilder("122");

        int i = 2;       // points to the group length
        int num = 1;     // next number to append: 1 or 2
        int count = 1;   // number of 1s

        while (s.length() < n) {
            int len = s.charAt(i) - '0';

            for (int j = 0; j < len && s.length() < n; j++) {
                s.append((char) ('0' + num));

                if (num == 1) {
                    count++;
                }
            }

            num = 3 - num; // 1 -> 2, 2 -> 1
            i++;
        }

        return count;
    }
}