package ProblemsDay_291;

public class RemoveLetterEqualizeFrequency {


    //https://leetcode.com/problems/remove-letter-to-equalize-frequency/?envType=problem-list-v2&envId=string
    public boolean equalFrequency(String word) {
        int[] freqArray = new int[26];
        for(char ch : word.toCharArray()) freqArray[ch - 'a']++;
        for(int i = 0; i < 26; i++) {
            if(freqArray[i] == 0) continue;
            else {
                freqArray[i]--;
                if(isAllOk(freqArray)) return true;
                freqArray[i]++;
            }
        }

        return false;
    }

    public boolean isAllOk(int[] freqArray) {
        int firstNonZeroFreq = -1;
        for(int element : freqArray) {
            if(element > 0) {
                firstNonZeroFreq = element;
                break;
            }
        }

        for(int element : freqArray) {
            if(element == 0) continue;
            if(firstNonZeroFreq == element) {
                continue;
            } else {
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {

    }
}
