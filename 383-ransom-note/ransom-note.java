class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] count = new int[26];

        // Count available letters in magazine
        for (char ch : magazine.toCharArray()) {
            count[ch - 'a']++;
        }

        // Consume letters needed for ransomNote
        for (char ch : ransomNote.toCharArray()) {
            count[ch - 'a']--;
            // If we needed more than we had, construction fails
            if (count[ch - 'a'] < 0) {
                return false;
            }
        }

        return true;
    }
}