package leetcode;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution139 {

    class Solution {
        public boolean wordBreak(String s, List<String> wordDict) {
            Set<String> set = new HashSet<>();
            set.addAll(wordDict);

            int length = s.length();

            boolean[] dp = new boolean[length + 1];
            dp[0] = true;

            for (int i = 1; i <= length; i++) {
                for (int j = 0; j < i; j++) {
                    if (dp[i]) {
                        break;
                    }
                    dp[i] = dp[j] && set.contains(s.substring(j, i));
                }
            }

            return dp[length];
        }
    }
}

