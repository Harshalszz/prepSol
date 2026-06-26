package ProblemsDay_375;

import java.util.HashMap;
import java.util.Map;

public class CountGoodMeals {

//https://leetcode.com/problems/count-good-meals/?envType=problem-list-v2&envId=array
    public int countPairs(int[] deliciousness) {
        long result = 0;
        int MOD = 1_000_000_007;
        int[] powTwo = new int[22];
        powTwo[0] = 1;
        for (int i = 1; i < 22; i++) {
            powTwo[i] = powTwo[i - 1] * 2;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int del : deliciousness) {
            for (int i = 0; i < 22; i++) {
                result = (result + map.getOrDefault(powTwo[i] - del, 0)) % MOD;
            }
            map.put(del, map.getOrDefault(del, 0) + 1);
        }
        return Math.toIntExact(result);
    }

    public static void main(String[] args) {

    }
}
