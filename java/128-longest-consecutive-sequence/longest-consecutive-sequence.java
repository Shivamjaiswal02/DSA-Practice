class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int count =0;
        int n = nums.length;
        for(int i=0;i<n;i++)
        {
            set.add(nums[i]);
        }
        int longest = 0;
        // iterate only unique numbers
        for (int num : set) 
        {
            if(!set.contains(num-1))
            {
                int currnum = num;
                int streak = 1;

                while(set.contains(currnum+1))
                {
                    currnum++;
                    streak++;
                }
                longest = Math.max(longest,streak);
            }
        }
        return longest;
    }
}