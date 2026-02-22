class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i=0;i<nums.length;i++) {
            if (nums[i] > 0) {   // only care about positive numbers
                set.add(nums[i]);
            }
        }

        int missing = 1;  // smallest positive starts at 1
        while (set.contains(missing)) {
            missing++;
        }
        return missing;
    }
}