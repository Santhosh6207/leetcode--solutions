class Solution {
    public boolean check(int n)
    {
        for(int i=1;i<Math.sqrt(n);i++)
        {
            if(n==Math.pow(3,i))
              return true;
        }
        return false;
    }
    public boolean isPowerOfThree(int n) {
        if(n<1)
        return false;
        if(n==1)
        return true;
        if(check(n))
        return true;
        return false;
        
    }
}