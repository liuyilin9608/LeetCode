package com.lyl.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class O_One {

	/*public static int[] twoSum(int[] nums, int target) {
        int m = 0 , n=0;
        for(int i = 0; i<= nums.length-1; i++){
            for(int j = i+1; j <= nums.length-1; j++){
                if(nums[i] + nums[j] == target){
                    m = i;
                    n = j;
                }
            }
        }
        int a[]={m,n};
		return a;
    }*/
	//值作为键，下标为值
	public static int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int []result = new int[2];
		for(int i = 0; i< nums.length; i++){
			if(map.containsKey(target - nums[i])){  
				result[0] = map.get(target - nums[i]); 
				result[1] = i;
				return result;
			}
			map.put(nums[i], i);
		}
		return result; 
    }
	public static void main(String[] args) {
		int nums[]= {3,3};
		System.out.println(Arrays.toString(nums));
		System.out.println(Arrays.toString(twoSum(nums, 6)));
	}
}
