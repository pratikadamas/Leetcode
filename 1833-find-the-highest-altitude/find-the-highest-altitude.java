class Solution {
    public int largestAltitude(int[] gain) {

        int n =gain.length;
        int[] res=new int[n+1];  //automatically initializes all elements to 0

        // for(int i=1;i<n+1;i++)
        // {
        //     res[i]=res[i]+gain[i-1];
        // }

        for(int i=1;i<n;i++){
            gain[i]=gain[i]+gain[i-1];
        }
        for(int i=1;i<n+1;i++)
        {
            res[i]=gain[i-1];
        }

        int max=Integer.MIN_VALUE;
        for(int e:res){
            if(max<e)
            max=e;
        }

        return max;
        
    }
}