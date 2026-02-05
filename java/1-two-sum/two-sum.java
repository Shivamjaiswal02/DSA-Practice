class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int successor =0;
        for(int i=0;i<nums.length;i++)
        {
            successor = target - nums[i];
            if(map.containsKey(successor))
            {
                return new int[] {map.get(successor),i};
            }
            else
            {
                map.put(nums[i],i);
            }
        }
        return new int[] {-1,-1};
    }
}