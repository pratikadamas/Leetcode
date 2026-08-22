class Solution {
    public boolean checkDivisibility(int n) {
       long Sum= sum(n);
       long product = product(n);


       return  n%(Sum+product) == 0?true:false;

    }
    public static long sum(int n){
        int temp=0;
        while(n>0)
        {
            temp+=n%10;
            n/=10;
        }
        return temp;
    }

    public static long product (int n){
        int temp=1;
        while(n>0)
        {
            temp*=n%10;
            n/=10;

        }
        return temp;
    }

}