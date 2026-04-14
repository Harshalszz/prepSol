package ProblemsDay_310;

public class CheckStringCanBreakAnotherString {

//https://leetcode.com/problems/check-if-a-string-can-break-another-string/?envType=problem-list-v2&envId=string
    public boolean checkIfCanBreak(String s1, String s2) {
        int[] freq1=new int[26];
        int[] freq2=new int[26];
        for(char c:s1.toCharArray()){
            freq1[c-'a']++;
        }
        for(char c:s2.toCharArray()){
            freq2[c-'a']++;
        }
        int i=0,j=0,count1=0,count2=0;
        while(i<26 && j<26){
            if(freq1[i]!=0 && freq2[j]!=0){
                if(i<=j){
                    count1++;
                }
                if(i>=j){
                    count2++;
                }
                freq1[i]--;
                freq2[j]--;
            }
            if(freq1[i]==0){
                i++;
            }
            if(freq2[j]==0){
                j++;
            }
        }
        if(count1==s1.length() || count2==s1.length()){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

    }
}
