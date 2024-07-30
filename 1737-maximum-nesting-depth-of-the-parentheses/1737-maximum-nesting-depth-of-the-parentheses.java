class Solution {
    public int maxDepth(String s) {
        int ans=0;
        int opb=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
             opb++;
             else if(s.charAt(i)==')')
              opb--;
              ans=Math.max(ans,opb);

        }
        return ans;
    }
}