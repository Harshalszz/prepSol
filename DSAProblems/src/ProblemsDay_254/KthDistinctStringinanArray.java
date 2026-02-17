package ProblemsDay_254;

import java.util.LinkedHashMap;
import java.util.Map;

public class KthDistinctStringinanArray {


    //https://leetcode.com/problems/kth-distinct-string-in-an-array/?envType=problem-list-v2&envId=string
    public String kthDistinct(String[] arr, int k) {
        Map<String, Integer> orderMap = new LinkedHashMap<>();

        for (String str : arr) {
            orderMap.put(str, orderMap.getOrDefault(str, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : orderMap.entrySet()) {
            if (entry.getValue() == 1 && --k == 0) {
                return entry.getKey();
            }
        }

        return "";
    }
    public static void main(String[] args) {

    }
}
