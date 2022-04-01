package test;

import javax.swing.*;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class LambdaTest {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 3, 3, 3, 3, 4, 5, 6, 7, 7, 8};
        int len = nums.length;
        int index = 0;
        int left = 0;
        int right;
        while (left < len) {
            for (right = left + 1; right < len; right++) {
                if (nums[left] != nums[right]) {
                    break;
                }
            }
            nums[index] = nums[left];
            index++;
            left = right;
        }


        for (int i = 0; i < index; i++) {
            System.out.println(nums[i]);
        }


    }





}
