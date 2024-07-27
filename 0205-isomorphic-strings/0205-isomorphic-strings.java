class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Character> hm = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            if (hm.containsKey(sChar)) {
                if (!hm.get(sChar).equals(tChar)) {
                    return false; 
                }
            } else {
                // If `tChar` is already mapped to a different `sChar`, return false
                if (hm.containsValue(tChar)) {
                    return false;
                }
                hm.put(sChar, tChar);
            }
        }
        return true;
    }
}
