package ProblemsDay_406;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning {

//https://leetcode.com/problems/palindrome-partitioning/
    public List<List<String>> partition(String s) {

        List<List<String>> resList = new ArrayList<>();

        backtracking(resList, new ArrayList<>(), s, 0);

        return resList;

    }

    public static void backtracking(List<List<String>> resList,List<String> tempList, String s, int start){

        if(start == s.length()){

            resList.add(new ArrayList(tempList));

            return;
        }


        for(int  i= start+1; i<=s.length() ; i++){

            if(isPalindrome(s,start,i-1)){

                tempList.add(s.substring(start,i));

                backtracking(resList, tempList,s,i);

                tempList.remove(tempList.size()-1);

            }
        }
    }

    public static boolean isPalindrome(String s, int start, int end ){

        while(start < end){
            if(s.charAt(start) != s.charAt(end)){
                return false;
            }

            start++;
            end--;
        }

        return true;
    }

    public static void main(String[] args) {

    }
}
