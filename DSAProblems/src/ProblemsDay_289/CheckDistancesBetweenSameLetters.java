package ProblemsDay_289;

public class CheckDistancesBetweenSameLetters {
//https://leetcode.com/problems/check-distances-between-same-letters/?envType=problem-list-v2&envId=string

    public boolean checkDistances(String s, int[] distance) {
        int n=s.length();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(s.charAt(i)==s.charAt(j) ){
                    int index=s.charAt(i)-'a';
                    int gap=j-i-1;
                    if(gap!=distance[index]){
                        return false;
                    }
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {

    }
}
