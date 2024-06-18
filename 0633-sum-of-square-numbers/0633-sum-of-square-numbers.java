class Solution {
    public boolean judgeSquareSum(int c) {
       int low=0,high=(int)Math.sqrt(c);
       while(low<=high)
       {
        long r=(low*low)+(long)(high*high);
        if(r==c)
        return true;
        else if(r>c)
         high=high-1;
         else
         low=low+1;
       }
      return false;  
    }
}