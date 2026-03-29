package ProblemsDay_294;

public class RemoveTrailingZerosFromString {
//https://leetcode.com/problems/remove-trailing-zeros-from-a-string/?envType=problem-list-v2&envId=string

    public String removeTrailingZeros(String num) {
        int i= num.length()-1;
        while(i>=0 && num.charAt(i)=='0')
        {
            i--;
        }
        String result = num.substring(0,i+1);
        return result;

    }
    public static void main(String[] args) {

    }
}
