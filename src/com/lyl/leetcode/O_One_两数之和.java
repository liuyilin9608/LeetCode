package com.lyl.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
/**
 * 
 *给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
    你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
示例:
给定 nums = [2, 7, 11, 15], target = 9
因为 nums[0] + nums[1] = 2 + 7 = 9
所以返回 [0, 1]
 */
public class O_One_两数之和 {

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
			//map的containsKey方法判断该map是中是否有key存在。存在返回true，不存在则返回false
			if(map.containsKey(target - nums[i])){  
				//与当前值和为指定值的数值的下标
				result[0] = map.get(target - nums[i]); 
				//当前值对应的下标
				result[1] = i;
				return result;
			}
			map.put(nums[i], i);
		}
		//没有和为target的两个值，返回下标[0,0]
		return result; 
    }
	//返回下标
	public static void main(String[] args) {
		int nums[]= {3,3};
		System.out.println(Arrays.toString(nums));
		System.out.println(Arrays.toString(twoSum(nums, 7)));
	}
}
