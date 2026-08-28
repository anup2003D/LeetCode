class Solution {
    public int recurse(int num, HashSet<Integer> hs){
        
        if(hs.contains(num+1)){
            
            return 1+ recurse(num+1, hs);
        }
        
        return 1;
    }
    

    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        int n=nums.length;
        if (n==0) return 0;
        for(int i=0; i<n; i++){
            hs.add(nums[i]);
        }
        int length=Integer.MIN_VALUE;
        for(int num: hs){
            if(!hs.contains(num-1)){
                int currentLength = recurse(num, hs);

                length = Math.max(length, currentLength);
            }
        }
        return length;
    }
}