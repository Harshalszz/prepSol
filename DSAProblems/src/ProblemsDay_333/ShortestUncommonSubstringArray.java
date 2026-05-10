package ProblemsDay_333;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ShortestUncommonSubstringArray {
//https://leetcode.com/problems/shortest-uncommon-substring-in-an-array/?envType=problem-list-v2&envId=string
    public String[] shortestSubstrings(String[] arr) {
        int n = arr.length;
        String[] ans= new String[n];
        for(int i=0; i<n; i++)  ans[i]="";
        for(int i=0; i<n; i++){
            String s = arr[i];
            int len = s.length();

            List<String> subs = new ArrayList<>();
            for(int j=1; j<=len; j++){
                for(int k=0; k<=len-j; k++){
                    subs.add(s.substring(k,k+j));
                }
            }

            Collections.sort(subs, new Comparator<String>(){
                public int compare(String a, String b){
                    if(a.length() != b.length()){
                        return a.length() - b.length();
                    }
                    return a.compareTo(b);
                }
            });

            for(String str : subs){
                boolean flag= false;
                for(int l=0; l<n; l++){
                    if(l==i) continue;
                    if(arr[l].contains(str)){
                        flag = true;
                        break;
                    }
                }
                if(flag==false){
                    ans[i] = str;
                    break;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {

    }
}
