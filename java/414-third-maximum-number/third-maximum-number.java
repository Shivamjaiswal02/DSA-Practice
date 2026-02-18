class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int last = nums[nums.length-1];
        int count=1;
        for(int i=nums.length-2;i>=0;i--)
        {
            if(nums[i] != last)
            {
                count++;
                last = nums[i];
            }
            if(count == 3) return last;
        }
        return nums[nums.length-1];
    }
}