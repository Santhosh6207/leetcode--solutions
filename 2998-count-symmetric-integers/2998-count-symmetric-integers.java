class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int c=0;
        for (int i = low; i <= high; i++) {
            String str = Integer.toString(i);
            if (str.length() % 2 == 0 && compare(str)) {
                c++;
            }
        }
        return c;
    }
    public boolean compare(String s)
    {
        int mid=s.length()/2;
        int sum=0;
        int sum1=0;
        for(int i=0;i<mid;i++)
        {
            sum+=Character.getNumericValue(s.charAt(i));
        }
        for(int i=mid;i<s.length();i++)
        {
            sum1+=Character.getNumericValue(s.charAt(i));
        }
        return sum==sum1;
    }
}