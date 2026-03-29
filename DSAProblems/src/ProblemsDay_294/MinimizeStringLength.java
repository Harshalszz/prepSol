package ProblemsDay_294;

public class MinimizeStringLength {

//https://leetcode.com/problems/minimize-string-length/?envType=problem-list-v2&envId=string
    public int minimizedStringLength(String s) {
        StringBuilder str = new StringBuilder("");
        for(int i =0;i<s.length();i++){
            char c = s.charAt(i);
            if(!str.toString().contains(String.valueOf(c))){
                str.append(s.charAt(i));
            }
        }
        return str.length();
    }

    public static void main(String[] args) {

    }
}
