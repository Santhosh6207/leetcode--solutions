class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int i=0;
        while(i<flowerbed.length&&n>0)
        {
            if(flowerbed[i]==1)
             i=i+2;
           else if(flowerbed[i]==0)
           {
              int prev=(i==0||flowerbed[i-1]==0)?0:1;
              int next=(i==flowerbed.length-1||flowerbed[i+1]==0)?0:1;
              if(prev==0&&next==0){
                n--;
                flowerbed[i]=1;
                i=i+2;
              }
              else
              i=i+3;
           }

        }
        return n<=0;
        
    }
}