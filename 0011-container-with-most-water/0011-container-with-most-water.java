class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int start = 0;
        int end = n - 1;
        int max = 0;

        while (start < end) {
            int vol = Math.min(height[start], height[end]) * (end - start);
            max = Math.max(max, vol);

            if (height[start] < height[end]) {
                start++;
            } else {
                end--;
            }
        }

        return max;
    }
}