package ProblemsDay_433;

public class LengthLastWord {

//https://leetcode.com/problems/length-of-last-word/?envType=problem-list-v2&envId=string
    public int lengthOfLastWord(String s) {
        int count =0;
        if(s.length() == 1){
            if(s.charAt(0) != ' '){
                return 1;
            }
            return 0;
        }
        for(int i=s.length() -1; i>=0; i--){
            if(s.charAt(i) != ' '){
                count++;
                if(i==0){
                    return count;
                }
                if(s.charAt(i-1) == ' '){
                    return count;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {

    }
}
