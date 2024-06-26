class Solution {
    public String addStrings(String num1, String num2) {
        int n1=num1.length()-1;
        int n2=num2.length()-1;
        int c=0;
        int sum=0;
        StringBuilder res=new StringBuilder();
        while(n1>=0||n2>=0)
        {
            int s1=0,s2=0;
            if(n1>=0)
            s1=num1.charAt(n1--)-'0';
            if(n2>=0)
            s2=num2.charAt(n2--)-'0';
            sum=s1+s2+c;
            if(sum>=10)
            {
                c=1;
                sum=sum-10;
            }
            else
            c=0;
            res.append(sum);
        }
        if(c==1)
        res.append(c);
       return res.reverse().toString();
        
    }
}