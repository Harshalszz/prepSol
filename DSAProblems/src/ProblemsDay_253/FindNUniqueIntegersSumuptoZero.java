package ProblemsDay_253;

public class FindNUniqueIntegersSumuptoZero {

    //https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/?envType=problem-list-v2&envId=array
    public int[] sumZero(int n) {
        int[] a = new int[n];
        int idx = 0;

        if (n % 2 != 0) {
            a[idx++] = 0;
        }

        for (int i = 1; i <= n / 2; i++) {
            a[idx++] = i;
            a[idx++] = -i;
        }

        return a;
    }
    public static void main(String[] args) {

    }
}
