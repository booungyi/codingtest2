package boo.condingtest2;

public class tailling_3x {
    public int solution(int n) {
        if (n % 2 == 1) {
            return 0;
        }
        int[] dp = new int[n + 1];
        final int MOD = 1_000_000_007;

        dp[0] = 0;
        dp[2] = 3;
    // TOdo 가정 1 : 타일을 2칸씩 짤라서봤을때의 경우의수 -배치가능한 경우의수
        for (int i = 4; i <= dp.length ; i +=2) {
            //dp[i] 가 4일떄 dp[2]=3*3 +dp[i-4]*2 +2 == 11
            //dp[4] = 11
            //dp[6] = 11*3 + 3+2 + 3*2 33+5+6=44??
            dp[i] = dp[i - 2] * 3 + dp[i - 4] % MOD;
            dp[i] = dp[i - 4] * 2 % MOD;
        }
        return 0;
    }
}
