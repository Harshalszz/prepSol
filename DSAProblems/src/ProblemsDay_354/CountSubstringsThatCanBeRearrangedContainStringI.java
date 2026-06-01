package ProblemsDay_354;

public class CountSubstringsThatCanBeRearrangedContainStringI {
//https://leetcode.com/problems/count-substrings-that-can-be-rearranged-to-contain-a-string-i/description/?envType=problem-list-v2&envId=string

    public long validSubstringCount(String word1, String word2) {
        int m=word1.length();
        int n=word2.length();

        int [] freq1=new int [26];
        int [] freq2=new int [26];

        for(int i=0;i<n;i++){
            freq2[word2.charAt(i)-'a']++;
        }
        long ans=0;

        int l=0;
        int r=0;
        while(r<m){
            freq1[word1.charAt(r)-'a']++;
            boolean flag=true;
            for(int i=0;i<26;i++){
                if(freq1[i]<freq2[i]){
                    flag=false;
                    break;
                }
            }
            while(flag &&l<=r){
                ans+=m-r;
                int alpha=word1.charAt(l)-'a';
                freq1[alpha]--;
                l++;
                if(freq1[alpha]<freq2[alpha]){
                    flag=false;
                }
            }
            r++;
        }
        return ans;


    }
    public static void main(String[] args) {

    }
}
