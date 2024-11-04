class Solution {
    public String compressedString(String word) {
        StringBuilder sb=new StringBuilder();
        int c=1;
        for(int i=1;i<=word.length();i++)
        {
            if(c==9||i==word.length()||word.charAt(i)!=word.charAt(i-1))
            {
                sb.append(c);
                sb.append(word.charAt(i-1));
                c=1;
            }
            else
            c++;
        }
        return sb.toString();
        
    }
}