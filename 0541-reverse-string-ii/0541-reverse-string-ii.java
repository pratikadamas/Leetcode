class Solution {
    public String reverseStr(String s, int k) {
        char[] arr = s.toCharArray();
        
        // Loop through the string, jumping 2k steps at a time
        for (int i = 0; i < arr.length; i += 2 * k) {
            int left = i;
            // The right boundary is either the end of the k-chunk or the end of the string
            int right = Math.min(i + k - 1, arr.length - 1);
            
            // Reverse the 'k' characters in place
            while (left < right) {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        
        return new String(arr);
    }
}
