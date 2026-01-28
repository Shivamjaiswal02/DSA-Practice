class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] freq = new int[256];  // fixed size (ASCII) → O(1) space
        int left = 0;
        int maxLen = 0;

        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
            freq[ch]++;

            // shrink window if duplicate
            while (freq[ch] > 1) {
                freq[s.charAt(left)]--;
                left++;
            }

            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }
}