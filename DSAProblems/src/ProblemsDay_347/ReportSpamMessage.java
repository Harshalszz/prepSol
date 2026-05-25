package ProblemsDay_347;

import java.util.HashSet;
import java.util.Set;

public class ReportSpamMessage {

//https://leetcode.com/problems/report-spam-message/?envType=problem-list-v2&envId=string
    public boolean reportSpam(String[] message, String[] bannedWords) {
        Set<String> set = new HashSet<>();
        int count = 0;

        // store banned words
        for(String str : bannedWords)
        {
            set.add(str);
        }

        // check message words if they are among banned ones
        for(int i = 0; i<message.length;i++)
        {
            if(set.contains(message[i]))
            {
                count++;
            }
        }
        if(count>=2)
        {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

    }
}
