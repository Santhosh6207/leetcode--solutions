class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int cr[]=new int[1001];
        ArrayList<Integer>al=new ArrayList<>();
        
        int max=-12234556;
        for(int i=0;i<arr1.length;i++)
        {
            if(arr1[i]>max)
                max=arr1[i];
        }
        for(int i=0;i<arr1.length;i++)
        {
            cr[arr1[i]]++;
        }
        for(int i:arr2)
        {
            while(cr[i]>0)
            {
                al.add(i);
                cr[i]--;
            }
           
        }
        for (int num = 0; num <=max; num++) {
            while (cr[num] > 0) {
                al.add(num);
                cr[num]--;
            }
        }
        for(int j=0;j<al.size();j++)
        {
            arr1[j]=al.get(j);
        }
        return arr1;
        
    }
}