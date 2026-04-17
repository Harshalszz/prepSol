package ProblemsDay_313;

import java.util.HashSet;

public class CountBeautifulSubstringsI {

//https://leetcode.com/problems/count-beautiful-substrings-i/?envType=problem-list-v2&envId=string
    public int beautifulSubstrings(String s, int k) {
        int n = s.length();

        HashSet<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');

        int count = 0;
        for(int i=0;i<n;i++){
            int vCount = 0;
            int cCount = 0;
            for(int j =i;j<n;j++){
                char ch = s.charAt(j);
                if(set.contains(Character.toLowerCase(ch))) vCount++;
                else cCount++;

                if(((vCount == cCount ) && ((vCount * cCount) % k == 0))) count++;
            }
        }
        return count ;
    }
}
