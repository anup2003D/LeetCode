class Solution {
    public String minWindow(String s, String t) {

        if (s.length() < t.length()) {
            return "";
        }

        HashMap<Character, Integer> need = new HashMap<>();
        HashMap<Character, Integer> window = new HashMap<>();

        // Frequency of characters required from t
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            need.put(c, need.getOrDefault(c, 0) + 1);
        }

        int l = 0;
        int r = 0;

        int count = 0;
        int required = t.length();

        int bestLength = Integer.MAX_VALUE;
        int bestLeft = 0;

        while (r < s.length()) {

            char current = s.charAt(r);

            // Add current character to window
            window.put(current, window.getOrDefault(current, 0) + 1);

            // This occurrence satisfies a requirement
            if (need.containsKey(current)
                    && window.get(current) <= need.get(current)) {
                count++;
            }

            // Try shrinking while window is valid
            while (count == required) {

                // Save the smallest valid window
                if (r - l + 1 < bestLength) {
                    bestLength = r - l + 1;
                    bestLeft = l;
                }

                char leftCharacter = s.charAt(l);

                // Remove one occurrence
                window.put(
                    leftCharacter,
                    window.get(leftCharacter) - 1
                );

                // Removing this character broke a requirement
                if (need.containsKey(leftCharacter)
                        && window.get(leftCharacter) < need.get(leftCharacter)) {
                    count--;
                }

                l++;
            }

            r++;
        }

        if (bestLength == Integer.MAX_VALUE) {
            return "";
        }

        return s.substring(bestLeft, bestLeft + bestLength);
    }
}