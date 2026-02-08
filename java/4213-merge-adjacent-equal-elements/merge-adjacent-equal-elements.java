class Solution {
    public List<Long> mergeAdjacent(int[] nums) {

        Stack<Long> st = new Stack<>();

        for (int i = 0; i < nums.length; i++) {
            long val = nums[i];

            while (!st.isEmpty() && st.peek() == val) {
                val = val + st.pop();
            }

            st.push(val);
        }

        return new ArrayList<>(st);
    }
}
