class Solution {
    public int[] twoSum(int[] nums, int target) {
        int a=0,b=0;
        int n=nums.length;
        for (int i=0; i<n ; i++){
            for (int j=i+1; j<n; j++){
                if (nums[i]+nums[j] == target){
                    a=i;
                    b=j;
                }
                else{
                    continue;
                }
            }
        }
        return new int[] {a,b};

        //nums, target;
        /*int x=0;
        int y=0,z=0;
        int n=nums.length;
        for (int i=x+1; i<n; i++){
            int a=nums[x];
            if (a + nums[i]==target){
                y=x; z=i;
                System.out.println(y+" "+z);
            }
            else{
                x++;
            }
        }
        
        return new int[] {y,z};*/
        

    }
}