class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int mul=1;
        int[] right = new int[n];
        for(int i=n-1; i>=0; i--){
            
            mul*=nums[i];
            right[i]=mul;
        }   

        int left=1;
        int[] ans = new int[n];
        for(int i=0; i<n-1; i++){
            int val = left*right[i+1];
            ans[i]=val;
            left=left*nums[i];
        }
        ans[n-1]=left;
        return ans;
    }
}