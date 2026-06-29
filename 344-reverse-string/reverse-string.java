class Solution {
    public void reverseString(char[] s) {

        int n=s.length;
        if(s==null || n==0) return ;
        int j=n-1;

        for(int i=0;i<j;i++)
        {
            char temp=s[i];
            s[i]=s[j];
            s[j]=temp;
            j--;
        }

    }

    
}