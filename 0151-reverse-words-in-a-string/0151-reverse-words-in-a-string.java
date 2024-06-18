class Solution {
    public String reverseWords(String s) {
        String ar[]=s.split(" ");
        StringBuilder sb=new StringBuilder();
        Stack<String>st=new Stack<>();
        for(int i=0;i<ar.length;i++)
        {   if(ar[i].isEmpty())
              continue;
        st.push(ar[i]);
        }
        int n=ar.length;
            while(!st.isEmpty()){
                sb.append(st.pop());
                sb.append(" ");
                }
                return sb.toString().trim();

    }
}