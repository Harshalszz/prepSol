package ProblemsDay_265;

public class TruncateSentence {

//https://leetcode.com/problems/truncate-sentence/?envType=problem-list-v2&envId=string
    public String truncateSentence(String s, int k) {
        String [] words = s.split(" ");
        StringBuilder sb = new StringBuilder();

        for(int i = 0;i<k;i++)
        {
            sb.append(words[i]);
            if(i!=k-1)
            {
                sb.append(" ");
            }
        }
        String ans = sb.toString();
        return ans;
    }
    public static void main(String[] args) {

    }
}
