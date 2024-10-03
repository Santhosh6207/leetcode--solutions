class Solution {
    public String makeGood(String s) {
        if(s.length()==1)
          return s;
        ArrayList<Character>al=new ArrayList<>();
        al.add(s.charAt(0));
        for(int i=1;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(!al.isEmpty()&&(al.get(al.size()-1)+32==ch||al.get(al.size()-1)-32==ch))
            {
                al.remove(al.size()-1);
            }
            else
            al.add(s.charAt(i));
        }
        String str="";
        for(char ch:al)
          str+=ch;
          return str;
    }
}