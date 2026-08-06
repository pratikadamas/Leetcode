class Solution {
    public int smallestNumber(int n, int t)
    {
        int res=0;
        while(n<=n+10)
        {
            if(digitpro(n)%t==0)
            {
                res=n;
                break;
            }
            n++;

        }
        return res;
        
    }

    public static int digitpro(int m)
    {
        int i=1;
        while(m>0)
        {
            i*=m%10;
            m/=10;
        }
        return i;

    }
}