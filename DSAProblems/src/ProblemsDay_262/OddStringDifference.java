package ProblemsDay_262;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OddStringDifference {

    //https://leetcode.com/problems/odd-string-difference/?envType=problem-list-v2&envId=string
    public String oddString(String[] words) {
        Map<List<Integer>, List<String>> map = new HashMap<>();

        for (int i = 0; i < words.length; i++) {
            char[] ch = words[i].toCharArray();
            List<Integer> list = new ArrayList<>();

            for (int j = 0; j < ch.length - 1; j++) {
                list.add(ch[j + 1] - ch[j]);
            }

            if (map.containsKey(list)) {
                map.get(list).add(words[i]);
            }
            else {
                List<String> l = new ArrayList<>();
                l.add(words[i]);
                map.put(list, l);
            }
        }

        for (List<Integer> key : map.keySet()) {
            if (map.get(key).size() == 1) {
                return map.get(key).get(0);
            }
        }

        return "";
    }
    public static void main(String[] args) {

    }
}
