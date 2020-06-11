package com.lyl.leetcode;

/**
 * 给定一个排序数组，你需要在 原地 删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
 * 不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 !!! O(1) 额外空间的条件下完成。
 示例 1:
给定数组 nums = [1,1,2], 
函数应该返回新的长度 2, 并且原数组 nums 的前两个元素被修改为 1, 2。 
你不需要考虑数组中超出新长度后面的元素。
示例 2:
给定 nums = [0,0,1,1,1,2,2,3,3,4],
函数应该返回新的长度 5, 并且原数组 nums 的前五个元素被修改为 0, 1, 2, 3, 4。
你不需要考虑数组中超出新长度后面的元素。
 */
/*
 * 思路：要求空间复杂度为O(1),首选快慢指针，因为数组已经排列好了，所以准备好快指针，从下标1开始遍历和慢指针从0开始遍历
 *      我们只需要在nums[i] = nums[i+1]的时候直接跳过，继续比较nums[i]与nums[i+2],,,在nums[i]! = nums[i+n]的时候，让慢指针
 *      进一位，这样也就制造了我们想要的数组。
 */
public class O_Five_删除重复项 {

	public static int removeDuplicates(int[] nums) {
		
		int k = 0;
		for(int i = 0; i < nums.length; i++){
			if(nums[i] == nums[k]){
				
			}else{
				k++;  
				nums[k] = nums[i]; //值后移
			}
		}
		return k + 1;
    }
	
	public static void main(String[] args) {
		
		int []nums = {0,0,1,1,1,2,2,3,3,4};
		int len = removeDuplicates(nums);
		System.out.println("新数组的长度：" + len);
	}
}
