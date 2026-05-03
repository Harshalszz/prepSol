package ProblemsDay_326;

import java.util.Stack;

public class FindMostCompetitiveSubsequence {

//https://leetcode.com/problems/find-the-most-competitive-subsequence/?envType=problem-list-v2&envId=array
    public int[] mostCompetitive(int[] nums, int k) {
        Stack<Integer> st = new Stack<>();

        int ind = 0;
        for(int val : nums){
            while(!st.isEmpty() && st.peek() > val && (st.size() + (nums.length - ind)) > k){
                st.pop();
            }

            if(st.size() < k){
                st.push(val);
            }
            ind++;
        }

        ind = k - 1;
        int[] res = new int[k];
        while(!st.isEmpty()){
            res[ind--] = st.pop();
        }

        return res;
    }

    public static void main(String[] args) {

    }
}
