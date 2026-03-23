package ProblemsDay_288;

public class CountUnhappyFriends {

    //https://leetcode.com/problems/count-unhappy-friends/?envType=problem-list-v2&envId=array
    public int unhappyFriends(int n, int[][] preferences, int[][] pairs) {
        int[] partner = new int[n];
        boolean[] unhappy = new boolean[n];

        // Map each person to their partner
        for (int[] p : pairs) {
            partner[p[0]] = p[1];
            partner[p[1]] = p[0];
        }

        // Iterate over each person
        for (int[] p : pairs) {
            for (int i = 0; i < p.length; i++) {
                int x = p[i];
                int y = partner[x];

                for (int pref : preferences[x]) {
                    if (pref == y) break;  // Stop when reaching the partner

                    int u = pref;
                    int v = partner[u];

                    // Check if x prefers u over y and u prefers x over its partner
                    for (int upref : preferences[u]) {
                        if (upref == x) {
                            unhappy[x] = true;
                            break;
                        }
                        if (upref == v) break;  // Stop if reaching u's partner
                    }
                }
            }
        }

        // Count the unhappy friends
        int count = 0;
        for (boolean u : unhappy) {
            if (u) count++;
        }

        return count;
    }
    public static void main(String[] args) {

    }
}
