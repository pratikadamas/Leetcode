class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";

      Arrays.sort(strs);

      StringBuilder s=new StringBuilder();
      String s1=strs[0];
      String s2=strs[strs.length-1];

        // Only iterate up to the length of the shortest string between s1 and s2
        for (int i = 0; i < Math.min(s1.length(), s2.length()); i++) {
            if (s1.charAt(i) == s2.charAt(i)) {
                s.append(s1.charAt(i));
            } else {
                // Stop at the first character that doesn't match
                break;
            }
        }

return s.toString();

    }
}
