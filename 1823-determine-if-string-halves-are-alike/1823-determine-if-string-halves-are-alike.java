class Solution {
    public boolean halvesAreAlike(String s) {
       int n=s.length();
       String str=s.substring(0,n/2);
       String str1=s.substring(n/2,n);
       int c=0;
       int c1=0;
       for(int i=0;i<str.length();i++)
       {
           char ch=str.charAt(i);
           if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
             c++;
       } 
        for(int i=0;i<str1.length();i++)
       {
           char ch=str1.charAt(i);
           if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
             c--;
       } 
       return c==0;
    }
}