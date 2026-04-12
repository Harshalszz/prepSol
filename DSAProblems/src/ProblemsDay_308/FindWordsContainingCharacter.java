package ProblemsDay_308;

import java.util.ArrayList;
import java.util.List;

public class FindWordsContainingCharacter {
//https://leetcode.com/problems/find-words-containing-character/?envType=problem-list-v2&envId=string

    public List<Integer> findWordsContaining(String[] words, char x) {
        ArrayList<Integer> map=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            if(words[i].indexOf(x)!=-1){
                map.add(i);
            }
        }
        return map;
    }

    public static void main(String[] args) {

    }
}
