package ProblemsDay_393;

import java.util.HashMap;
import java.util.Map;

public class BullsandCows {

//https://leetcode.com/problems/bulls-and-cows/
    public String getHint(String secret, String guess) {
        int cows = 0;
        int bulls  = 0;
        Map<Character,Integer> sec = new HashMap<>();
        Map<Character,Integer> gue = new HashMap<>();

        for(int i = 0; i < secret.length(); i++){
            char s = secret.charAt(i);
            char g = guess.charAt(i);

            if(s == g){
                bulls++;
            }
            else{
                sec.put(s,sec.getOrDefault(s,0) +1);
                gue.put(g,gue.getOrDefault(g,0) +1);
            }
        }

        for(char c : sec.keySet()){ //secret keys ke hashmap m saare character check krege ki agr guess wali m koi b match krta h to wo cow h
            if(gue.containsKey(c)){
                cows += Math.min(sec.get(c),gue.get(c));
            }
        }
        return bulls + "A" + cows + "B"; // output
    }

    public static void main(String[] args) {

    }
}
