package ProblemsDay_302;

import java.util.HashMap;
import java.util.Map;

public class SenderWithLargestWordCount {

//https://leetcode.com/problems/sender-with-largest-word-count/?envType=problem-list-v2&envId=string
    public String largestWordCount(String[] messages, String[] senders) {
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < messages.length; i++) {
            String message = messages[i];
            String sender = senders[i];

            // Count words in the message
            int wordCount = message.split(" ").length;

            // Add to sender's total
            map.put(sender, map.getOrDefault(sender, 0) + wordCount);
        }

        String result = "";
        int max = 0;

        for (String sender : map.keySet()) {
            int count = map.get(sender);

            // If higher word count OR same count but lexicographically larger name
            if (count > max || (count == max && sender.compareTo(result) > 0)) {
                max = count;
                result = sender;
            }
        }

        return result;
    }
    public static void main(String[] args) {

    }
}
