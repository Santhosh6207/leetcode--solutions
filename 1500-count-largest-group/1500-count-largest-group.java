class Solution {
    public int countLargestGroup(int n) {
       if(n<=9)
          return n; 
          HashMap<Integer,Integer>hm=new HashMap<>();
          int c=0;
          int maxi=0;
          for(int i=1;i<=n;i++)
          {
              int q=digit_sum(i);
              hm.put(q,hm.getOrDefault(q,0)+1);
              maxi=Math.max(maxi,hm.get(q));
          }
        for(Map.Entry<Integer,Integer>entry:hm.entrySet())
        {
            int q=entry.getValue();
             if(q==maxi)
               c++;
        }
        return c;
    }
    public int digit_sum(int num)
    {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}