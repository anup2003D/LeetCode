class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans= {-1, -1};
        if (nums.length==0){
            return ans;
        }
        ans[0]=firstOcc(nums, target);
        ans[1]=lastOcc(nums, target);
        return ans;
    }

        public int firstOcc(int[] nums, int target){
            int n=nums.length;
            int low=0;
            int high=n-1;
            int index=-1;
            while(low<=high){
                int mid=(low+high)/2;
                if(nums[mid]==target){
                    index=mid;
                    high=mid-1;
                }
                else if(target<nums[mid]){
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            return index;
        }

        public int lastOcc(int[] nums, int target){
            int n=nums.length;
            int low=0;
            int high=n-1;
            int index=-1;
            while(low<=high){
                int mid=(low+high)/2;
                if(nums[mid]==target){
                    index=mid;
                    low=mid+1;
                }
                else if(target<nums[mid]){
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            return index;
        }
    
}