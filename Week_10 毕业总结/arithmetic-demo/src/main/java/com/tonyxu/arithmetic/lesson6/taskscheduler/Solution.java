package com.tonyxu.arithmetic.lesson6.taskscheduler;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: Leo.xu
 * @Date: 2021/03/14/9:22
 * @Description:
 */
public class Solution {

    public static void main(String[] args) {
        char[] tasks =  new char[]{'A','A','A','B','B','B'};
        System.out.println(new Solution().leastInterval(tasks,2));
    }

    public int leastInterval(char[] tasks, int n) {
        int[] buckets = new int[26];
        for (char task : tasks) {
            buckets[task - 'A']++;
        }
        Arrays.sort(buckets);
        int maxTimes = buckets[25];
        int maxCount = 1;
        for(int i = 25; i >= 1; i--){
            if(buckets[i] == buckets[i - 1]) {
                maxCount++;
            } else {
                break;
            }
        }
        int res = (maxTimes - 1) * (n + 1) + maxCount;
        return Math.max(res, tasks.length);
    }
}
