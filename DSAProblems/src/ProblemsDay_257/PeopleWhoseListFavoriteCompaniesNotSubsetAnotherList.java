package ProblemsDay_257;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PeopleWhoseListFavoriteCompaniesNotSubsetAnotherList {

    //https://leetcode.com/problems/people-whose-list-of-favorite-companies-is-not-a-subset-of-another-list/?envType=problem-list-v2&envId=array
    public List<Integer> peopleIndexes(List<List<String>> favoriteCompanies) {
        List<Map<String, Integer>> ls = new ArrayList<>();

        for (int i = 0; i < favoriteCompanies.size(); i++) {
            Map<String, Integer> mp1 = new HashMap<>();
            for (int j = 0; j < favoriteCompanies.get(i).size(); j++) {
                String company = favoriteCompanies.get(i).get(j);
                mp1.put(company, mp1.getOrDefault(company, 0) + 1);
            }
            ls.add(mp1);
        }

        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < ls.size(); i++) {
            boolean isSubset = false;
            for (int j = 0; j < ls.size(); j++) {
                if (i != j) {
                    Map<String, Integer> x1 = ls.get(i);
                    Map<String, Integer> x2 = ls.get(j);
                    int count = 0;
                    for (String x : x1.keySet()) {
                        if (x2.containsKey(x)) {
                            count++;
                        }
                    }
                    if (count == x1.size()) {
                        isSubset = true;
                        break;
                    }
                }
            }
            if (!isSubset) {
                ans.add(i);
            }
        }

        return ans;
    }
    public static void main(String[] args) {

    }
}
