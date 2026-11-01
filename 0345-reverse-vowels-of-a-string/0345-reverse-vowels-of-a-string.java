class Solution {
    public String reverseVowels(String s) {

        String vowels = "aeiouAEIOU";
        StringBuilder res = new StringBuilder(s);

        int i = 0;
        int j = s.length() - 1;

        while (i < j) {

            if (vowels.indexOf(res.charAt(i)) == -1) {
                i++;
            }
            else if (vowels.indexOf(res.charAt(j)) == -1) {
                j--;
            }
            else {
                // Swap vowels
                char temp = res.charAt(i);
                res.setCharAt(i, res.charAt(j));
                res.setCharAt(j, temp);

                i++;
                j--;
            }
        }

        return res.toString();
    }
}