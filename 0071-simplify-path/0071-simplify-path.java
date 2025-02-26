class Solution {
    public String simplifyPath(String path) {
      String array[]= path.split("/");
      Stack<String>st=new Stack<>();
      for(String str:array)
      {
        if(str.equals("")||str.equals("."))
          continue;
          if (str.equals("..")) {
                if (!st.isEmpty()) {
                    st.pop();
                }
            } else {
                st.push(str); 
            }
        }

      
      StringBuilder sb=new StringBuilder();
      while(!st.isEmpty())
      {
        sb.insert(0,"/"+st.pop());
      }
      return sb.length()==0?"/":sb.toString();
    }
}