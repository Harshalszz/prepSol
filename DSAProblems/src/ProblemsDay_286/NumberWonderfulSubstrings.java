package ProblemsDay_286;

public class NumberWonderfulSubstrings {

//https://leetcode.com/problems/number-of-wonderful-substrings/?envType=problem-list-v2&envId=string
    public long wonderfulSubstrings(String word) {

        int[] cache = new int[1024];
        long ans = 0L;

        int mask = 0;
        cache[0] = 1;
        for(char ch: word.toCharArray()){
            mask ^= (1 << ch-'a');
            ans += cache[mask];
            cache[mask]++;
            for(int i=0; i<10; i++){
                ans += cache[mask ^ (1 << i)];
            }
        }

        return ans;
    }

    public static void main(String[] args) {

    }
}
