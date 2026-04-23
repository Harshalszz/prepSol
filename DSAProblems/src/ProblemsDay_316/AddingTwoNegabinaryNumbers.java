package ProblemsDay_316;

import java.util.Arrays;

public class AddingTwoNegabinaryNumbers {

//https://leetcode.com/problems/adding-two-negabinary-numbers/?envType=problem-list-v2&envId=array
    public int[] addNegabinary(int[] arr1, int[] arr2) {
        int m = arr1.length, n = arr2.length;

        int z = m + n + 1;
        int[] res = new int[z];

        int x = m - 1, y = n - 1, leftmostOneIndx = z - 1, carry = 0;
        while ((x >= 0) || (y >= 0) || (carry != 0)) {
            int a = x >= 0 ? arr1[x--] : 0;
            int b = y >= 0 ? arr2[y--] : 0;

            int sum = a + b + carry;

            res[--z] = sum & 1;

            if (res[z] == 1) leftmostOneIndx = z;

            carry = (res[z] - sum) >> 1;
        }

        return Arrays.copyOfRange(res, leftmostOneIndx, m + n + 1);
    }

    public static void main(String[] args) {

    }
}
