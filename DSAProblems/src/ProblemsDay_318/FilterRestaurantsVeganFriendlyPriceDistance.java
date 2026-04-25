package ProblemsDay_318;

import java.util.ArrayList;
import java.util.List;

public class FilterRestaurantsVeganFriendlyPriceDistance {

//https://leetcode.com/problems/filter-restaurants-by-vegan-friendly-price-and-distance/?envType=problem-list-v2&envId=array
    public List<Integer> filterRestaurants(int[][] restaurants, int veganFriendly, int maxPrice, int maxDistance) {
        List<int[]> list = new ArrayList<>();
        for (int[] r : restaurants) {
            if ((veganFriendly == 0 || r[2] == 1) && r[3] <= maxPrice && r[4] <= maxDistance) {
                list.add(r);
            }
        }
        list.sort((a, b) -> {
            if (b[1] != a[1]) return b[1] - a[1];
            return b[0] - a[0];
        });
        List<Integer> res = new ArrayList<>();
        for (int[] r : list) res.add(r[0]);
        return res;
    }

    public static void main(String[] args) {

    }
}
