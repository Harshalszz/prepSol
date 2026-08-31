package ProblemsDay_436;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class RemoveDuplicateLetters {

//https://leetcode.com/problems/remove-duplicate-letters/?envType=problem-list-v2&envId=string
    public String removeDuplicateLetters(String s) {

        Stack<Character> stack = new Stack<>();
        Set<Character> visited = new HashSet<>();
        HashMap<Character,Integer> lastoccur = new HashMap<>();

        for(int i=0; i<s.length() ; i++){
            lastoccur.put(s.charAt(i), i);
        }

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(!visited.contains(ch)){
                while(!stack.isEmpty() && ch<stack.peek() && i<lastoccur.get(stack.peek())){
                    visited.remove(stack.pop());
                }

                stack.push(ch);
                visited.add(ch);
            }
        }

        StringBuilder res = new StringBuilder();

        for(char c : stack){
            res.append(c);
        }

        return res.toString();

    }
    public static void main(String[] args) {

    }
}
