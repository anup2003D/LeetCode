class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> smap = new HashMap<>();
        HashMap<Character, Integer> tmap = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            if(smap.containsKey(s.charAt(i))){       
                smap.put(s.charAt(i), smap.getOrDefault(s.charAt(i),0) + 1);
            }
            else{
                smap.put(s.charAt(i),1);
            }
        }

        for(int i=0; i<t.length(); i++){
            if(tmap.containsKey(t.charAt(i))){       
                tmap.put(t.charAt(i), tmap.getOrDefault(t.charAt(i),0) + 1);
            }
            else{
                tmap.put(t.charAt(i), 1);
            }
        }
        if(smap.equals(tmap)) return true;
        else return false;
    }
}