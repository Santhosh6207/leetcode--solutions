class Solution {
    public int countPalindromicSubsequence(String s) {
        int res = 0;

        // Iterate over all lowercase alphabets (a-z)
        for (char ch = 'a'; ch <= 'z'; ch++) {
            int left = s.indexOf(ch); // Find the first occurrence of the character
            int right = s.lastIndexOf(ch); // Find the last occurrence of the character

            // If the character occurs at least twice
            if (left != -1 && right > left) {
                HashSet<Character> uniqueChars = new HashSet<>();

                // Collect unique characters between the first and last occurrence
                for (int i = left + 1; i < right; i++) {
                    uniqueChars.add(s.charAt(i));
                }

                // Add the count of unique characters to the result
                res += uniqueChars.size();
            }
        }

        return res;
    }
}
