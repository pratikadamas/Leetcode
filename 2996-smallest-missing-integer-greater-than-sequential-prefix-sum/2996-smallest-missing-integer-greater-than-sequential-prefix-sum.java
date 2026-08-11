class Solution {
    public int missingInteger(int[] nums) {


        HashMap<Integer,Integer> map=new HashMap<>();
        for(int e:nums){
            map.put(e,map.getOrDefault(e,0)+1);
        }
        int length=1;

        for(int i=1;i<nums.length;i++){
            if(nums[i] == nums[i - 1] + 1){
                length++;
            }
            else{
                break;
            }

        }

        int sum=0;
        for(int i=0;i<length;i++){
            sum+=nums[i];
        }
        int temp=sum;

        while(true){
            if(!map.containsKey(temp)){
                    return temp;

            }
            temp++;
        }



        
    }
}