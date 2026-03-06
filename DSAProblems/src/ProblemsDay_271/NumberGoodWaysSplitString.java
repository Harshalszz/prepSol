package ProblemsDay_271;

public class NumberGoodWaysSplitString {
//https://leetcode.com/problems/number-of-good-ways-to-split-a-string/?envType=problem-list-v2&envId=string

    public int numSplits(String s) {
        int result=0;
        int distint=0;
        int distinct2=0;
        int[] arr=new int[26];
        int[] arr2=new int[26];

        for(int i=0;i<s.length();i++){
            int c=s.charAt(i)-'a';
            if(arr[c]++ == 0) distint++;
        }

        for(int i=0;i<s.length();i++){
            int c=s.charAt(i)-'a';
            if(arr2[c]++ ==0) distinct2++;
            if(arr2[c] == arr[c]) distint--;

            if(distint == distinct2) result++;
        }
        return result;
    }
    public static void main(String[] args) {

    }
}
