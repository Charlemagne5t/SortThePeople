import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int n = names.length;
        int[][] nh = new int[n][2];

        for(int i = 0; i < n;i++) {
            nh[i][0] = i;
            nh[i][1] = heights[i];
        }

        Arrays.sort(nh, Comparator.comparingInt((int[] a) -> a[1]));
        String[] res = new String[n];
        for(int i = 0; i < n; i++) {
            res[n - 1 - i] = names[nh[i][0]];
        }

        return res;
    }
}