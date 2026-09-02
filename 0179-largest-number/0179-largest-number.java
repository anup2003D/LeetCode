class Solution {
    public String largestNumber(int[] nums) {
        Integer[] arr = new Integer[nums.length];

        for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[i];
        }
        Arrays.sort(arr, (a,b)-> (""+b+a).compareTo(""+a+b));
        String s="";
        for(int num: arr){
            s+= String.valueOf(num);
        }
        if(s.charAt(0)=='0') return "0";
        return s;
    }
}