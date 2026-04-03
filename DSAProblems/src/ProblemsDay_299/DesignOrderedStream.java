package ProblemsDay_299;

import java.util.ArrayList;
import java.util.List;

public class DesignOrderedStream {

//https://leetcode.com/problems/design-an-ordered-stream/?envType=problem-list-v2&envId=array
    class OrderedStream {
        int ptr;
        String[] res;

        public OrderedStream(int n) {
            ptr = 0;
            res = new String[n];
        }

        public List<String> insert(int id, String value) {
            List<String> list = new ArrayList<>();

            res[id - 1] = value;
            while (ptr < res.length && res[ptr] != null) {
                list.add(res[ptr]);
                ptr++;
            }

            return list;
        }
    }

    public static void main(String[] args) {

    }
}
