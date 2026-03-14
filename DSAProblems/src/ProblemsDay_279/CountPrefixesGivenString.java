package ProblemsDay_279;

public class CountPrefixesGivenString {

    //https://leetcode.com/problems/count-prefixes-of-a-given-string/?envType=problem-list-v2&envId=string
    public int countPrefixes(String[] words, String s) {
        int count=0;
        for(String str:words){
            if(s.startsWith(str))count++;
        }
        return count;
    }

    public static void main(String[] args) {

    }
}
