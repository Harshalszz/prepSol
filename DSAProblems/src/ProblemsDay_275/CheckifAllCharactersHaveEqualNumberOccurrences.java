package ProblemsDay_275;

public class CheckifAllCharactersHaveEqualNumberOccurrences {

//https://leetcode.com/problems/check-if-all-characters-have-equal-number-of-occurrences/?envType=problem-list-v2&envId=string
    public boolean areOccurrencesEqual(String s) {

        int[] charArr = new int[26];

        for(char ch : s.toCharArray()){

            charArr[ch-'a']++;
        }

        int count = charArr[s.charAt(0) - 'a'];

        for(int i=0; i<26; i++){

            if( charArr[i] > 0 && count != charArr[i]){
                return false;
            }

        }

        return true;

    }
    public static void main(String[] args) {

    }
}
