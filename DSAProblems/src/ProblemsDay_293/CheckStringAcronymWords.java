package ProblemsDay_293;

import java.util.List;

public class CheckStringAcronymWords {
//https://leetcode.com/problems/check-if-a-string-is-an-acronym-of-words/?envType=problem-list-v2&envId=string

    public boolean isAcronym(List<String> words, String s) {
        boolean b =false;
        String res ="";
        for(String x : words)
        {
            char t = x.charAt(0);
            res= res +t;
        }
        if(res.equals(s))
        {
            b= true;
        }
        else
        {
            b= false;
        }
        return b;
    }

    public static void main(String[] args) {

    }
}
