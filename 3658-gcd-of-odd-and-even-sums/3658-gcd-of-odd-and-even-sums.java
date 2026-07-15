class Solution {
    public int gcdOfOddEvenSums(int n) 
    {
        int sumodd=(n*(1+1+(n-1)*2))/2;
        int sumeven=(n*(2+2+(n-1)*2))/2;

        return GCD(sumodd,sumeven);
    }

      public static int GCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a); // Handles negative inputs
    }
}