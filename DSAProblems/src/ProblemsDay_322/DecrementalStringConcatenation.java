package ProblemsDay_322;

public class DecrementalStringConcatenation {


    public int minimizeConcatenatedLength(String[] words) {
        Integer[][][] dp = new Integer[words.length][26][26];
        return f(words,1,words[0].charAt(0),words[0].charAt(words[0].length()-1),dp) + words[0].length();
    }
    public int f(String[] words,int index,char s,char e,Integer[][][] dp){
        if(index >= words.length){
            return 0;
        }
        if(dp[index][s-'a'][e-'a'] != null){
            return dp[index][s-'a'][e-'a'];
        }
        int order = Integer.MAX_VALUE;
        int reverse = Integer.MAX_VALUE;
        if(e == words[index].charAt(0)){
            order = f(words,index+1,s,words[index].charAt(words[index].length()-1),dp) + words[index].length()-1;
        }
        else{
            order = f(words,index+1,s,words[index].charAt(words[index].length()-1),dp) + words[index].length();
        }
        if(words[index].charAt(words[index].length()-1) == s){
            reverse = f(words,index+1,words[index].charAt(0),e,dp) + words[index].length()-1;
        }
        else{
            reverse = f(words,index+1,words[index].charAt(0),e,dp) + words[index].length();
        }
        return dp[index][s-'a'][e-'a'] = Math.min(order,reverse);
    }

    public static void main(String[] args) {

    }
}
