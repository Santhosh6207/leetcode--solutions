class Solution {
    public boolean judgeSquareSum(int c) {
        for(int i=0;i<=Math.sqrt(c);i++)
        {
            double j=(Math.sqrt(c-i*i));
            if(j==(int)j)
            return true;
        }
        return false;
        
    }
}