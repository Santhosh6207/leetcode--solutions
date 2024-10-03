class Solution {
    public String makeGood(String s) {
        if(s.length()==1)
          return s;
        StringBuilder stack = new StringBuilder();  // Using StringBuilder as a stack

        for (char ch : s.toCharArray()) {
            int len = stack.length();

            // If the stack is not empty and the top of the stack cancels with the current character
            if (len > 0 && Math.abs(stack.charAt(len - 1) - ch) == 32) {
                stack.deleteCharAt(len - 1);  // Remove the last character if it cancels out
            } else {
                stack.append(ch);  // Otherwise, push the current character onto the stack
            }
        }

        return stack.toString();  // Convert the stack back to a string
    }
}