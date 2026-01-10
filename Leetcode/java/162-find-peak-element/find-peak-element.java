class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length-1;
        if(nums.length==1) return 0;
        if(nums[0]>nums[1])return 0;
        if(nums[n]>nums[n-1]) return n;
        int start=1;
        int end =nums.length-2;
        while(start<=end)
        {
            int mid = start+(end-start)/2;
            if(nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1])
            {
                return mid;
            }
            else if(nums[mid]<nums[mid+1])
            {
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }
}