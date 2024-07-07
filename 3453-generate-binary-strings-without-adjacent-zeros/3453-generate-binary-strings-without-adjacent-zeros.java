class Solution {
    public static String ArrayToString(int[] a) {
        StringBuilder sb = new StringBuilder();
        for (int i : a) {
            sb.append(i);
        }
        return sb.toString();
    }

    public static void printBs(List<String> al, int ar[], int n, int idx) {
        if (idx == n) {
            al.add(ArrayToString(ar));
            return;
        }
        if (idx == 0 || ar[idx - 1] == 1) {
            ar[idx] = 0;
            printBs(al, ar, n, idx + 1);
            ar[idx] = 1;
            printBs(al, ar, n, idx + 1);
        }
        if (idx > 0 && ar[idx - 1] == 0) {
            ar[idx] = 1;
            printBs(al, ar, n, idx + 1);
        }
    }

    public List<String> validStrings(int n) {
        List<String> al = new ArrayList<String>();
        int ar[] = new int[n];
        if (n == 1) {
            al.add("0");
            al.add("1");
            return al;
        }
        int idx;
        idx = 0;
        ar[0] = 0;
        printBs(al, ar, n, idx + 1);
        ar[0] = 1;
        printBs(al, ar, n, idx + 1);
        return al;
    }
}