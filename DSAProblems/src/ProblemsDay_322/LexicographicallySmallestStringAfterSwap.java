package ProblemsDay_322;

public class LexicographicallySmallestStringAfterSwap
{

    //https://leetcode.com/problems/lexicographically-smallest-string-after-a-swap/?envType=problem-list-v2&envId=string

    public String getSmallestString(String s) {
        char [] str = s.toCharArray();
        for(int i=0; i<s.length()-1; i++)
        {
            int a = str[i] - '0';
            int b = str[i+1] - '0';
            if(a%2 == b%2 && a>b)
            {
                char temp = str[i];
                str[i] = str[i+1];
                str[i+1] = temp;
                break;
            }
        }
        return new String(str);
    }

    public static void main(String[] args) {

    }
}
