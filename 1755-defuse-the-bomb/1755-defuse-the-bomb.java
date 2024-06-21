class Solution {
    public int[] decrypt(int[] code, int k) {
        int ar[]=new int[code.length];
        if(k==0)
        {
            for(int i=0;i<code.length;i++)
            ar[i]=0;
        }
        if(k>0)
        {
        for(int i=0;i<code.length;i++)
        {
            int sum=0;
            for(int j=1;j<=k;j++)
            {
                sum+=code[(i+j)%code.length];
            }
            ar[i]=sum;
        }
        }
        else
        {
            for (int i = 0; i < code.length; i++) {
                int sum = 0;
                for (int j = 1; j <= -1 * k; j++) {
                    sum += code[(i - j + code.length) % code.length];

                }
                ar[i]=sum;
        }
       
    }
     return ar;
}
}