class Solution {
    public char findKthBit(int n, int k) {
        StringBuilder sb = new StringBuilder("0");
        for (int i = 1; i < n; i++) {
            StringBuilder inverted = new StringBuilder(invert(sb.toString()));
            sb.append("1").append(inverted.reverse());
        }
        return sb.charAt(k - 1);
    }
    public String invert(String s) {
        StringBuilder inverted = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                inverted.append('1');
            } else {
                inverted.append('0');
            }
        }
        
        return inverted.toString();
    }
}
