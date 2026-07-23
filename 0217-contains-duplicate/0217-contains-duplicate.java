class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(hm.containsKey(nums[i])){
               hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
            }
            else{
                hm.put(nums[i], 1);
            }
        }
        boolean flag=false;
        for(int value: hm.values()){
            if(value>1){
                flag=true;
            }
        }
        return flag;
    }
}