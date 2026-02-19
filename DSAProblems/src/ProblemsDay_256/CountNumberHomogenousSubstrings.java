package ProblemsDay_256;

public class CountNumberHomogenousSubstrings {

    //https://leetcode.com/problems/count-number-of-homogenous-substrings/?envType=problem-list-v2&envId=string

    public int countHomogenous(String s) {
        long res  = 0;
        char[] c = s.toCharArray();
        int start =0;
        for(int i=0;i<c.length;i++)
        {
            if(c[i]!=c[start])
            {
                int appear = i-start;
                while(appear>0)
                {
                    res+=appear;
                    appear-=1;
                }
                start=i;
            }
        }

        int appear = c.length-start;
        while(appear>0)
        {
            res+=appear;
            appear-=1;
        }

        return (int)(res%(Math.pow(10,9)+7));
    }
    public static void main(String[] args) {

    }
}
