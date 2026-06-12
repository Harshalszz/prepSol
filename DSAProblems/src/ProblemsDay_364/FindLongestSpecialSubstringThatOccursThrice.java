package ProblemsDay_364;

public class FindLongestSpecialSubstringThatOccursThrice {

//https://leetcode.com/problems/find-longest-special-substring-that-occurs-thrice-ii/?envType=problem-list-v2&envId=string
    public int maximumLength(String s) {
        int n=s.length();
        int freq[][]=new int[26][n+1];
        char prev=s.charAt(0);
        freq[prev-'a'][1]=1;
        int max=-1;
        int length=1;
        for(int i=1;i<s.length();i++){
            char curr=s.charAt(i);
            if(prev==curr){
                length++;
                freq[s.charAt(i)-'a'][length]++;
            }
            else{
                length=1;
                freq[s.charAt(i)-'a'][length]++;
                prev=curr;
            }
        }
        for(int i=0;i<26;i++){
            int sum=0;
            for(int j=n;j>=1;j--){
                sum+=freq[i][j];
                if(sum>=3)
                    max=Math.max(max,j);
            }
        }
        return max;
    }
    public static void main(String[] args) {

    }
}
