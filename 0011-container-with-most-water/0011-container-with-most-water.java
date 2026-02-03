class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int left=0; int right=n-1;
        int length=right-left;
        int[] water=new int[n];
        int x=0;
        /*if(length==1){
            return length*Math.min(height[left], height[right]);
        }*/
        while(left<right) {
            water[x]=length*Math.min(height[left], height[right]);
            x++; 
            if (height[left] < height[right]){
                left++;
                length--;
            }
            else{
                right--; length--;
            }

        }
        int max=water[0];
        for(int i=1; i<n; i++){
            if(max<water[i]){
                max=water[i];
            }
        }
        return max;
    }
}