package leetcode;

public class Solution1200 extends Solution539{

    private String testPrivate1200;
    public String testPublic1200;


    public static int countVowelPermutation(int n) {
        long ans = 0;
        long[][] dp = new long[2][5];
        for (int i = 0; i < 5; i++) {
            dp[0][i] = 1;
        }
        for (int i = 1; i < n; i++) {
            dp[1][0] = (dp[0][1] + dp[0][2] + dp[0][4]);
            dp[1][1] = (dp[0][0] + dp[0][2]) ;
            dp[1][2] = (dp[0][1] + dp[0][3]);
            dp[1][3] = dp[0][2];
            dp[1][4] = (dp[0][2] + dp[0][3]);
            for (int j = 0; j < 5; j++) {
                dp[0][j] = dp[1][j];
            }
        }

        for (int i = 0; i < 5; i++) {
            ans = (ans + dp[1][i]) % 1000000007;
        }
        return (int)(ans);
    }

    private int testPrivateMethod1200() {
        return 0;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public String getTestPrivate1200() {
        return testPrivate1200;
    }

    public void setTestPrivate1200(String testPrivate1200) {
        this.testPrivate1200 = testPrivate1200;
    }

    public String getTestPublic1200() {
        return testPublic1200;
    }

    public void setTestPublic1200(String testPublic1200) {
        this.testPublic1200 = testPublic1200;
    }
}
