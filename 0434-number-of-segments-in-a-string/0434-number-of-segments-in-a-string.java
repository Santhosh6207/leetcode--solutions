class Solution {
    public int countSegments(String s) {
        if(s.length()==0)
          return 0;
        Stack<String>st=new Stack<>();
        String str[]=s.split(" ");
        int c=0;
        for(int i=0;i<str.length;i++)
        {    if(str[i].isEmpty())
               c++;
            st.push(str[i]);
        }
        return st.size()-c;
    }
}