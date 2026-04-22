package ProblemsDay_315;

public class CountSubstringsStartingEndingGivenCharacter {
//https://leetcode.com/problems/count-substrings-starting-and-ending-with-given-character/?envType=problem-list-v2&envId=string
    public long countSubstrings(String s, char c) {
        int n = s.length();
        long cnt = 0;
        for(int i =0 ;i<n ; i++){
            if(s.charAt(i)==c) cnt++;
        }

        return cnt + (cnt*(cnt-1))/2;
    }

    public static void main(String[] args) {

    }
}
