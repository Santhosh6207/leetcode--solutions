class Solution {
    public int fun(int idx,int[] ar,int cxor){
        if(idx==ar.length)
           return cxor;
           int include=fun(idx+1,ar,cxor^ar[idx]);
           int exclude=fun(idx+1,ar,cxor);
         return include+exclude;
    }
    public int subsetXORSum(int[] nums) {
      return fun(0,nums,0);  
    }
}