class Solution {
    public boolean checkIfExist(int[] arr)
    {
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int e:arr)
        {
            map.put(e,map.getOrDefault(e,0)+1);
            //  map.put(e, map.getOrDefault(e, 0) + 1);
        }

        for(int e:arr)
        {
              if (e == 0) {
                if (map.get(0) > 1) {
                    return true;
                }
            } 

           else if(map.containsKey(2*e))
                return true;
        }

        return false;
    }
}