package com.tonyxu.arithmetic.lesson5.foursum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author tonyxu
 */
public class Solution {

    List<List<Integer>> ans = new ArrayList<>();
    List<Integer> list = new ArrayList<>();
    int cur = 0;
    int num = 4;

    public static void main(String[] args) {
        int[] nums = new int[]{1,0,-1,0,-2,2};
        System.out.println(new Solution().fourSum(nums, 0));
    }

    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        dfs(nums, target,0);
        return ans;
    }
    void dfs(int[] nums, int target, int begin){
        if(list.size() == num){
            if(cur == target){
                ans.add(new ArrayList<>(list));
            }
            return;
        }

        for(int i = begin; i < nums.length; i++ ){
            if(nums.length - i  < 4 - list.size()) {
                return;
            }
            if(begin != i && nums[i - 1] == nums[i]) {
                continue;
            }
            if(i < nums.length - 1 && cur + nums[i] + (3 - list.size()) * nums[i + 1] > target) {
                return;
            }
            if(i < nums.length - 1 && cur + nums[i] + (3 - list.size()) * nums[nums.length - 1] < target) {
                continue;
            }
            cur += nums[i];
            list.add(nums[i]);
            dfs(nums, target, i + 1);
            list.remove(list.size() - 1);
            cur -= nums[i];
        }
    }
}
