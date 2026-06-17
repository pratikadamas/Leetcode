class Solution {
    public char processStr(String s, long k) {
        int n = s.length();

        long[] len = new long[n + 1];
        len[0] = 0;

        // Build lengths after each operation
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                len[i + 1] = len[i] + 1;
            } else if (ch == '*') {
                len[i + 1] = Math.max(0, len[i] - 1);
            } else if (ch == '#') {
                len[i + 1] = Math.min(Long.MAX_VALUE / 2, len[i] * 2);
            } else { // '%'
                len[i + 1] = len[i];
            }
        }

        if (k >= len[n]) {
            return '.';
        }

        // Work backwards
        for (int i = n - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            long prevLen = len[i];
            long curLen = len[i + 1];

            if (ch >= 'a' && ch <= 'z') {

                // This character was appended at position prevLen
                if (k == prevLen) {
                    return ch;
                }

            } else if (ch == '*') {

                // Before '*', length was one larger (if possible)
                if (curLen < prevLen) {
                    // Nothing to do, k remains same
                }

            } else if (ch == '#') {

                // Result = old + old
                if (k >= prevLen) {
                    k -= prevLen;
                }

            } else { // '%'

                // Reverse operation
                if (curLen > 0) {
                    k = curLen - 1 - k;
                }
            }
        }

        return '.';
    }
}