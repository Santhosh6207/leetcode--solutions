class Solution {
    public int numberOfArrays(int[] differences, int lower, int upper) {
       long x=0;
       long min=0;
       long max=0;
       for(int num:differences)
       {
        x+=num;
        min=Math.min(min,x);
        max=Math.max(max,x);
       }
      
            return (int)(Math.max(0,(upper-lower+1)-(max-min)));
    }
}