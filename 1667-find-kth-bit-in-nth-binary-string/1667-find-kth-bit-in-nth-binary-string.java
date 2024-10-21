class Solution {
    public char findKthBit(int n, int k) {
        // Start with S1 = "0"
        String s = "0";

        // Build the sequence S_n
        for (int i = 1; i < n; i++) {
            // Invert S_i, reverse it, and concatenate to form S_(i+1)
            String inverted = invert(s);
            String reversed = new StringBuilder(inverted).reverse().toString();
            s = s + "1" + reversed;  // Create S_(i+1)
        }

        // Return the k-th bit (adjust for 1-based index)
        return s.charAt(k - 1);
    }

    // Method to invert (flip 0 to 1 and 1 to 0)
    public String invert(String s) {
        StringBuilder result = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c == '0') {
                result.append('1');
            } else {
                result.append('0');
            }
        }
        return result.toString();
    }
}
