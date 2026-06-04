package ProblemsDay_357;

public class MaxChunkMakeSorted {

//https://leetcode.com/problems/max-chunks-to-make-sorted/

    public int maxChunksToSorted(int[] arr) {
        int chunks =0, maxEle =0;

        for(int i=0;i <arr.length; i++){

            maxEle = Math.max(maxEle , arr[i]);

            if(maxEle == i){
                chunks++;
            }
        }

        return chunks;
    }

    public static void main(String[] args) {

    }
}
