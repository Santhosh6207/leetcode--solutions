class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>>hm=new HashMap<>();
        for(String str:strs)
        {
            char[] ch=str.toCharArray();
            Arrays.sort(ch);
            String str1=String.valueOf(ch);
            if(!hm.containsKey(str1))
               hm.put(str1,new ArrayList<>());
               hm.get(str1).add(str);
        }
        return new ArrayList<>(hm.values());
    }
}