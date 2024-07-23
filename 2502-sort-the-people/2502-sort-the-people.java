class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
       TreeMap<Integer,String>tm=new TreeMap<>();
       for(int i=0;i<names.length;i++)
       {
        tm.put(heights[i],names[i]);
       }
       int j=names.length-1;
       for(Map.Entry<Integer,String>entry:tm.entrySet())
       {
        names[j]=entry.getValue();
        j--;
       }
       return names;
    }
}