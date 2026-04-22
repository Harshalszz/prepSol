package ProblemsDay_315;

import java.util.ArrayList;
import java.util.List;

public class ExistenceSubstringStringItsReverse {
//https://leetcode.com/problems/existence-of-a-substring-in-a-string-and-its-reverse/?envType=problem-list-v2&envId=string

    public boolean isSubstringPresent(String s) {
        List<String> nm=new ArrayList<>();
        for(int i=0;i<s.length()-1;i++)
        {
            nm.add(s.charAt(i)+""+s.charAt(i+1));
        }
        String rev=new StringBuilder(s).reverse().toString();
        for(int i=0;i<nm.size();i++)
        {
            if(s.contains(nm.get(i)) && rev.contains(nm.get(i)))
            {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {

    }
}
