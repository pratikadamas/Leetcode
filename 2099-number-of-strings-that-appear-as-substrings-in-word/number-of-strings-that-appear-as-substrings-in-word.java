class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int count=0;

        for(String s1: patterns){
            if(word.contains(s1)){
                count ++;
            }
        }

      return count;  
    }
}