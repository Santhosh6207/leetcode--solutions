class Solution {
    public int[][] merge(int[][] intervals) {
        int n=intervals.length;
        Arrays.sort(intervals,new Comparator<int[]>(){
            public int compare(int a[],int b[])
            {
              return a[0]-b[0];
            }
        });
        List<List<Integer>>al=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            int start=intervals[i][0];
            int end=intervals[i][1];
            if(!al.isEmpty()&&end<=al.get(al.size()-1).get(1))
               continue;
               for(int j=i+1;j<n;j++)
               {
                if(end>=intervals[j][0])
                {
                       end=Math.max(intervals[j][1],end);
                }
                else
                break;
               }
               al.add(Arrays.asList(start,end));
        }
        int[][] result = new int[al.size()][2];
        for (int i = 0; i < al.size(); i++) {
            result[i][0] = al.get(i).get(0);
            result[i][1] = al.get(i).get(1);
        }
        
        return result;
           
    }
}