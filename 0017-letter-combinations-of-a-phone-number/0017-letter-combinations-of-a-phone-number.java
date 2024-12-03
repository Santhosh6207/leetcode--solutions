import java.util.*;

class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        if (digits == null || digits.length() == 0) {
            return res;
        }
        
        // Create a mapping of digits to letters
        HashMap<Character, String> hm = new HashMap<>();
        hm.put('2', "abc");
        hm.put('3', "def");
        hm.put('4', "ghi");
        hm.put('5', "jkl");
        hm.put('6', "mno");
        hm.put('7', "pqrs");
        hm.put('8', "tuv");
        hm.put('9', "wxyz");

        // Start backtracking
        Backtrack(digits, 0, new StringBuilder(), res, hm);
        return res;
    }

    public void Backtrack(String digits, int idx, StringBuilder pos, List<String> res, HashMap<Character, String> hm) {
        if (idx == digits.length()) {  // Corrected the comparison to '==' instead of '='
            res.add(pos.toString());
            return;
        }
        
        // Get the string of possible characters for the current digit
        String str = hm.get(digits.charAt(idx));
        
        // Try all possible characters for the current digit
        for (char s : str.toCharArray()) {
            pos.append(s);  // Append the current character
            Backtrack(digits, idx + 1, pos, res, hm);  // Recurse with the next digit
            pos.deleteCharAt(pos.length() - 1);  // Backtrack by removing the last character
        }
    }
}
