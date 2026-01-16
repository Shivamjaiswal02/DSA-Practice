class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            int key = nums[i];
            if(map.containsKey(key))
            {
            map.put(key,map.get(key)+1);
            }
            else
            {
                map.put(key,1);
            }
        }
        for(Integer key : map.keySet())
        {
            if(map.get(key)>n/2)
            {
                return key;
            }
        }
        return -1;
    }
}