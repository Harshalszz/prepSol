package ProblemsDay_320;

public class MaximumOddBinaryNumber {

//https://leetcode.com/problems/maximum-odd-binary-number/?envType=problem-list-v2&envId=string
    public String maximumOddBinaryNumber(String s) {
        int one=0;
        int zero=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='1')
                one++;
            else
                zero++;
        }
        String ans="";
        int temp=one;
        while(one>=2)
        {
            ans+=1+"";
            one--;
        }
        for(int i=0;i<s.length()-temp;i++)
        {
            ans+=0+"";
        }
        ans+=1+"";
        return ans;
    }
    public static void main(String[] args) {

    }
}
