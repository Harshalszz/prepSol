package ProblemsDay_257;

public class VowelsofAllSubstrings {

    //https://leetcode.com/problems/vowels-of-all-substrings/?envType=problem-list-v2&envId=string
    public boolean isVowel(char ch){
        return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u';
    }
    public long countVowels(String word) {
        long count = 0 ;
        int len = word.length() ;
        for(int i=0;i<len;i++){
            if(isVowel(word.charAt(i))){
                count+=(long)(len-i)*(long)(i+1);
            }
        }
        return count ;
    }
    public static void main(String[] args) {

    }
}
