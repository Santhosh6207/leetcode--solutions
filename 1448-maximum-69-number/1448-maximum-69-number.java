class Solution {
    public int maximum69Number (int num) {
        
        StringBuilder sb=new StringBuilder(String.valueOf(num));
        for(int i=0;i<sb.length();i++)
        {
            if(sb.charAt(i)=='6')
            {
             sb.setCharAt(i,'9');
             break;
            }
        }
        int n=Integer.parseInt(sb.toString());
        return n;
    }
}