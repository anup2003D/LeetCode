class Solution {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        int flag = -1;
        while(start<=end){
            int mid = (start+end)/2;
            if(target>nums[mid]){
                start=mid+1;
            }
            else if(target<nums[mid]){
                end=mid-1;
            }
            else if(target==nums[mid]){
                flag = mid;
                break;
            }
        }
        return flag;
    }
}