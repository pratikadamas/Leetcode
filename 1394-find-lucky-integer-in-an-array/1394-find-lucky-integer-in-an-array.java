class Solution {
    public int findLucky(int[] arr) {

        HashMap<Integer,Integer> map=new HashMap<>();
        // A

        for(int e:arr){
            if(map.containsKey(e)){
                map.put(e,map.get(e)+1);
            }
            else{
                map.put(e,map.getOrDefault(e,0)+1);
            }
        }

    int max=Integer.MIN_VALUE;
        for (int key : map.keySet())
        {
            if(key==map.get(key))
            {
                int temp=map.get(key);
                max=Math.max(temp,max);
            }
               
        }
        
        return max!=Integer.MIN_VALUE?max:-1;
    }
}