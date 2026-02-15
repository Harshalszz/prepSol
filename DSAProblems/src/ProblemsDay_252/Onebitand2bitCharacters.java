package ProblemsDay_252;

public class Onebitand2bitCharacters {
//https://leetcode.com/problems/1-bit-and-2-bit-characters/?envType=problem-list-v2&envId=array
    public boolean isOneBitCharacter(int[] bits) {
        final int n=bits.length;
        int i=0;
        while(i<n-1){
            i+=1+bits[i];
        }
        return i==n-1;
    }
    public static void main(String[] args) {

    }
}
