class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum =0;
        int maxsum = 0;
        int left=0;
        for(int i=0;i<k;i++)
        {
            sum +=nums[i];
        }
        maxsum =sum;
        for(int i=k;i<nums.length;i++)
        {
            sum += nums[i]-nums[left];
            maxsum = Math.max(sum,maxsum);
            left++;
        }
        double avg = (double)maxsum/k;
        return avg;
    }
}