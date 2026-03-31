package ProblemsDay_296;

public class FindMaximumNumberofStringPairs {

    //https://leetcode.com/problems/find-maximum-number-of-string-pairs/?envType=problem-list-v2&envId=string
    public int maximumNumberOfStringPairs(String[] words) {

        int n = words.length;
        int count = 0;
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                String reversed = new StringBuilder(words[j]).reverse().toString();
                if (words[i].equals(reversed)) {
                    count++;
                }
            }
        }
        return count;
    }


    public static void main(String[] args) {

    }
}
