class Solution {
    public String losingPlayer(int x, int y) {
        for(int i=0;i<1000;i++)
        {
            x-=1;
            y-=4;
            if(x<0||y<0)
              return i%2==0?"Bob":"Alice";
        }
       return ""; 
    }
}