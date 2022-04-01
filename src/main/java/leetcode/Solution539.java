package leetcode;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution539 {

    private String testPrivate539;
    public String testPublic539;

    public static int findMinDifference(List<String> timePoints) {
        int size = timePoints.size();
        int[] mins = new int[size];
        for (int i = 0; i < size; i++) {
            String time = timePoints.get(i);
            String[] hourAndMinute = time.split(":");
            mins[i] = Integer.parseInt(hourAndMinute[0]) * 60 + Integer.parseInt(hourAndMinute[1]);
        }
        Arrays.sort(mins);
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < size; i++) {
            min = Math.min(mins[i] - mins[i - 1], min);
        }
        min = Math.min(min, mins[0] + 1440 - mins[size - 1]);
        return min;
    }

    private int testPrivateMethod539() {
        return 0;
    }


}
