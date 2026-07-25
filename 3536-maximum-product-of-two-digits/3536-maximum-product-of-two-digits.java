class Solution {
    public int maxProduct(int n) {
        if(n==0)
            return 0;
       
        int size=0;
        int temp=n;

        while(n>0){
            n=n/10;
           size++;
        }
        int arr[]=new int[size];
     
        for(int i=0;i<size;i++){
            arr[i]= temp%10;
            temp=temp/10;
        }
        Arrays.sort(arr);

      return arr[size-1]*arr[size-2];  
    }
}