class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        int max_len=0;
        int n=nums.length;
        for(int i=0; i<n; i++){
            hs.add(nums[i]);
        }

        for(int num: hs){
            if(!hs.contains(num-1)){
                int curr=num;
                int len=1;
                while(hs.contains(curr+1)){
                    curr++; len++;
                }
                max_len=Math.max(max_len, len);
            }
        }
        return max_len;
    }
}