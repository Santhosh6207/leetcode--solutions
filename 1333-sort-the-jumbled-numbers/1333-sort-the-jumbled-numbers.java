class Solution {
    public int[] sortJumbled(int[] mapping, int[] nums) {
    int n=nums.length;
    int res[]=new int[n];
    int ar[][]=new int[n][2];
    for(int i=0;i<n;i++)
    {
        int temp=nums[i];
        int sum=0;
            int p=0;
           if(temp==0)
           {
            ar[i][0]=mapping[0];
            ar[i][1]=0;
           } 
           else
           {
        while(temp!=0)
        {
            
            sum+=mapping[temp%10]*Math.pow(10,p);
            temp=(temp)/10;
            p++;
        }
        ar[i][0]=sum;
        ar[i][1]=nums[i];
    }
    }
    Arrays.sort(ar,new Comparator<int[]>(){
        public int compare(int a[],int b[])
        {
        return Integer.compare(a[0],b[0]);
        }
    });
    for(int i=0;i<n;i++)
    {
        res[i]=ar[i][1];
    }
       return res; 
    }
}