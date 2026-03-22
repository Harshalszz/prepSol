package ProblemsDay_287;

public class MaximumValueafterInsertion {
//https://leetcode.com/problems/maximum-value-after-insertion/?envType=problem-list-v2&envId=string

    public String maxValue(String n, int x) {
        char ch = (char) (x + '0');
        if (n.charAt(0) == '-') {
            int i = 1;
            while (i < n.length() && n.charAt(i) - '0' <= x) {
                i++;
            }
            return n.substring(0, i) + ch + n.substring(i);
        } else {
            int i = 0;
            while (i < n.length() && n.charAt(i) - '0' >= x) {
                i++;
            }
            return n.substring(0, i) + ch + n.substring(i);
        }
    }
    public static void main(String[] args) {

    }
}
