package ProblemsDay_289;

import java.util.HashMap;

public class DecodetheMessage {
//https://leetcode.com/problems/decode-the-message/?envType=problem-list-v2&envId=string
    public String decodeMessage(String key, String message) {
        HashMap<Character,Character> map = new HashMap<>();
        int ascii = 97;
        for(int i =0 ;i<key.length();i++){
            char ch = key.charAt(i);
            if(!map.containsKey(ch) && ch != ' '){
                map.put(ch,(char)ascii);
                ascii +=1;
            }
        }

        StringBuilder ans = new StringBuilder();

        for(int i =0 ;i<message.length();i++){
            char ch = message.charAt(i);
            if(ch == ' '){
                ans.append(" ");
            }
            else{
                ans.append(map.get(ch));
            }
        }
        return ans.toString();
    }
    public static void main(String[] args) {

    }
}
