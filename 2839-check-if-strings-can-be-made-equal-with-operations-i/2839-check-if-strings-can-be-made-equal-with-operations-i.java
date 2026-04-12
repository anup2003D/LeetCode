class Solution {
    public boolean canBeEqual(String s1, String s2) {
        StringBuilder sb = new StringBuilder(s1);
        int i=0;
        int j=i+2;

        // combination 1: no swap at all
        String noSwap = sb.toString();

        // combination 2: swap even pair only (0 and 2)
        sb = new StringBuilder(s1);
        char temp = sb.charAt(0);
        sb.setCharAt(0, sb.charAt(2));
        sb.setCharAt(2, temp);
        String swapEven = sb.toString();

        // combination 3: swap odd pair only (1 and 3)
        sb = new StringBuilder(s1);
        temp = sb.charAt(1);
        sb.setCharAt(1, sb.charAt(3));
        sb.setCharAt(3, temp);
        String swapOdd = sb.toString();

        // combination 4: swap both pairs
        sb = new StringBuilder(s1);
        
        temp = sb.charAt(0); 
        sb.setCharAt(0, sb.charAt(2)); 
        sb.setCharAt(2, temp);


        temp = sb.charAt(1); 
        sb.setCharAt(1, sb.charAt(3)); 
        sb.setCharAt(3, temp);
        String swapBoth = sb.toString();

        // check if any combination equals s2
        return noSwap.equals(s2) || swapEven.equals(s2) 
            || swapOdd.equals(s2) || swapBoth.equals(s2);
        //System.out.println(sb.toString());
        
    }
}