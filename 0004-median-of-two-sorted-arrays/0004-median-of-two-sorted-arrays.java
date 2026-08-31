class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length + nums2.length;
        int[] nums3 = new int[n];
        int i=0; int j=0; int k=0;
        float ans = 0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<nums2[j]){
                nums3[k++] = nums1[i++];
            }
            else{
                nums3[k++] = nums2[j++];
            }
        }
        
        while (i < nums1.length) nums3[k++] = nums1[i++];
        while (j < nums2.length) nums3[k++] = nums2[j++];
        
        if(n%2!=0){
            return nums3[n/2];
        }
        else{
            return (nums3[n/2 - 1] + nums3[n/2])/2.0;
        }
    }
}