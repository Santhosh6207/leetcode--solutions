class Solution {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        int sum=skill[0]+skill[skill.length-1];
        int i=0;
        int j=skill.length-1;
        long chem=0;
        while(i<j)
        {
            int csum=skill[i]+skill[j];
            if(csum!=sum)
              return -1;
              else
              {
                  chem+=(skill[i]*skill[j]);
                  i++;
                  j--;
              }
        }
        return chem;
    }
}