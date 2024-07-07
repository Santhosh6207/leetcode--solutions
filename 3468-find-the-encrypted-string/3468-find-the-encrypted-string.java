class Solution {
    public String getEncryptedString(String s, int k) {
        StringBuffer sb=new StringBuffer();
        int n=s.length();
        
        for(int i=0;i<s.length();i++)
        {  sb.append( s.charAt((i+k)%n));
           
            
        }
        return sb.toString();
        
    }
}