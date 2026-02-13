class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length-1;
        int si = 1;
        int ei = n-1;
        if(nums.length==1) return 0;
        if(nums[0]>nums[1]) return 0;
        if(nums[n]>nums[n-1]) return n;
            while(si<=ei)
            {
                int mid = si+(ei-si)/2;
                if(nums[mid]>nums[mid+1] && nums[mid]>nums[mid-1])
                {
                    return mid;
                }
                else if(nums[mid]<nums[mid+1])
                {
                    si = mid+1;
                }
                else{
                    ei = mid-1;
                }
            }
        return 0;
    }
}