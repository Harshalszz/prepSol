package ProblemsDay_327;

import java.util.HashMap;
import java.util.Map;

public class TuplewithSameProduct {

//https://leetcode.com/problems/tuple-with-same-product/?envType=problem-list-v2&envId=array
    public int tupleSameProduct(int[] nums) {
        Map<Integer, Integer> productCount = new HashMap<>();
        int n = nums.length;

        // Generate all unique pairs and count their products
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int product = nums[i] * nums[j];
                productCount.put(product, productCount.getOrDefault(product, 0) + 1);
            }
        }

        // Calculate the number of valid tuples
        int total = 0;
        for (int count : productCount.values()) {
            if (count >= 2) {
                total += count * (count - 1) / 2;
            }
        }

        return total * 8; // Each tuple can be arranged in 8 different ways
    }

    public static void main(String[] args) {

    }
}
