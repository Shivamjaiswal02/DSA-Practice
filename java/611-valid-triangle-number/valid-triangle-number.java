class Solution {
    public int triangleNumber(int[] arr) {
        Arrays.sort(arr);
        int count = 0;

        for (int i = arr.length - 1; i >= 2; i--) {
            int left = 0;
            int right = i - 1;

            while (left < right) {
                if (arr[left] + arr[right] > arr[i]) {
                    // All elements from left to right-1 are valid
                    count += right - left;
                    right--;
                } else {
                    left++;
                }
            }
        }

        return count;
    }
}
