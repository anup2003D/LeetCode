class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> hs = new HashSet<>();
        int n = s.length();
        int l = 0;
        int r = 0;

        int max = 0;
        //for(int i=0; i<n; i++){
          while(r<n) {   
            
            if(hs.contains(s.charAt(r))){
                hs.remove(s.charAt(l));
                l++;
            }
            else {
                hs.add(s.charAt(r));
               
                r++;
                 max = Math.max(max, r-l); 
            
                
                
            }
            
            
        }
        return max;
    }
}