class Solution {
    public String removeDuplicateLetters(String s) {
        StringBuilder sb=new StringBuilder();
        HashMap<Character,Integer>hm=new HashMap<>();
        HashMap<Character,Integer>hm1=new HashMap<>();
        Stack<Character>st=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            hm1.put(s.charAt(i),hm1.getOrDefault(s.charAt(i),0)+1);
        } 
        for(int i=0;i<s.length();i++)
        {
             if(hm.containsKey(s.charAt(i))==true)
             {
                 hm1.put(s.charAt(i),hm1.getOrDefault(s.charAt(i),0)-1);
                 continue;
             }
             while(!st.isEmpty()&&(st.peek()>s.charAt(i))&&hm1.get(st.peek())>=1)
             {   
                hm.remove(st.peek());
               st.pop();
                
             }

            st.push(s.charAt(i));
            hm.put(s.charAt(i),1);
             hm1.put(s.charAt(i),hm1.getOrDefault(s.charAt(i),0)-1);
        }
        while(!st.isEmpty())
        {
            sb.append(st.pop());
        }
      return sb.reverse().toString();  
    }
}