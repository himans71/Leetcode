class Leetcode10 {
    public boolean isMatch(String s, String p) {
        int m = s.length();
        int n = p.length();

        // dp[i][j] indicates whether s[0..i-1] matches p[0..j-1]
        boolean[][] dp = new boolean[m + 1][n + 1];

        // Base case: empty string matches empty pattern
        dp[0][0] = true;

        // Deals with patterns like a*, a*b*, a*b*c* matching empty string s
        for (int j = 2; j <= n; j++) {
            if (p.charAt(j - 1) == '*') {
                dp[0][j] = dp[0][j - 2];
            }
        }

        // Fill the DP table
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                char sc = s.charAt(i - 1);
                char pc = p.charAt(j - 1);

                if (pc == '*') {
                    // Option 1: Consider 0 occurrences of the preceding element
                    dp[i][j] = dp[i][j - 2];

                    // Option 2: Match 1 or more occurrences if preceding char matches
                    char prevChar = p.charAt(j - 2);
                    if (prevChar == '.' || prevChar == sc) {
                        dp[i][j] = dp[i][j] || dp[i - 1][j];
                    }
                } else if (pc == '.' || pc == sc) {
                    dp[i][j] = dp[i - 1][j - 1];
                }
            }
        }

        return dp[m][n];
    }
}