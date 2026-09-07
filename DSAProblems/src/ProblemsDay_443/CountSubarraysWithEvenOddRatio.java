package ProblemsDay_443;

public class CountSubarraysWithEvenOddRatio {


    public int countRatioSubarrays(int[] nums, int a, int b) {

        int n = nums.length;

        int[] even = new int[n + 1];
        int[] odd = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            even[i] = even[i - 1];
            odd[i] = odd[i - 1];

            if ((nums[i - 1] & 1) == 0) {
                even[i]++;
            } else {
                odd[i]++;
            }
        }

        int res = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                int oddCount = odd[j] - odd[i];
                if (oddCount == 0)
                    continue;

                int left = b * (even[j] - even[i]);
                int right = a * oddCount;

                if (left <= right)
                    res++;
            }
        }

        return res;
    }

    public static void main(String[] args) {

    }
}
