package ProblemsDay_310;

public class MinimumAdjacentSwapsReachKthSmallestNumber {

    //https://leetcode.com/problems/minimum-adjacent-swaps-to-reach-the-kth-smallest-number/?envType=problem-list-v2&envId=string

    public int getMinSwaps(String num, int k) {
        String permutation = getKthPermutation(num, k);
        return minDigitSwap(num, permutation);
    }

    private int minDigitSwap(String num, String expected) {
        char[] origin = num.toCharArray();
        int count = 0;
        for (int i = 0; i < origin.length - 1; i++) {
            if (origin[i] == expected.charAt(i)) continue;
            int j = i;
            while (expected.charAt(i) != origin[j]) j++;
            for (int k = j; k > i; k--) {
                swap(origin, k, k - 1);
                count++;
            }
        }
        return count;

    }

    private String getKthPermutation(String str, int k) {
        while (k-- > 0) {
            str = getNextPermutation(str);
        }
        return str;
    }

    private String getNextPermutation(String str) {
        char[] chars = str.toCharArray();
        int pivot = -1;
        for (int i = str.length() - 2; i >= 0; i--) {
            if (str.charAt(i) < str.charAt(i + 1)) {
                pivot = i;
                break;
            }
        }

        int successor = -1;
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) > str.charAt(pivot)) {
                successor = i;
                break;
            }
        }
        swap(chars, pivot, successor);
        reverse(chars, pivot + 1, str.length() - 1);
        return new String(chars);
    }

    private void reverse(char[] chars, int start, int end) {
        while (start < end) {
            swap(chars, start++, end--);
        }
    }

    private void swap(char[] chars, int i, int j) {
        char tmp = chars[j];
        chars[j] = chars[i];
        chars[i] = tmp;
    }
    public static void main(String[] args) {

    }
}
