package ProblemsDay_291;

public class CountNumberVowelStringsRange {

//https://leetcode.com/problems/count-the-number-of-vowel-strings-in-range/?envType=problem-list-v2&envId=string
    public int vowelStrings(String[] words, int left, int right) {

        int count = 0;

        for( int i = left ; i <= right ; i++ ){

            String word = words[i];
            char first = word.charAt(0);
            char last = word.charAt(word.length()-1);

            if( ( first == 'a' || first == 'e' || first == 'i' || first == 'o' || first == 'u'  ) &&
                    ( last == 'a' || last == 'e' || last == 'i' || last == 'o' || last == 'u' )){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

    }
}
