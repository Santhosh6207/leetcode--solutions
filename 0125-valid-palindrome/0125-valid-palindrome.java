class Solution {
    public boolean isPalindrome(String s) {
        if(s==" ")
           return true;
        StringBuilder sb=new StringBuilder();
        String str=s.toLowerCase().trim();
        for(int i=0;i<str.length();i++)
        {
            if(!Character.isLetter(str.charAt(i))&&!Character.isDigit(str.charAt(i)))
              continue;
              else
              sb.append(str.charAt(i));
        }
        System.out.println(sb);
        int left=0;
        int right=sb.length()-1;
        while(left<right)
        {
            if(sb.charAt(left)!=sb.charAt(right))
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
        
    }
}