package com.lyl.leetcode;


/*
 * 最长公共前缀
编写一个函数来查找字符串数组中的最长公共前缀。
如果不存在公共前缀，返回空字符串 ""。
示例 1:
输入: ["flower","flow","flight"]
输出: "fl"
示例 2:
输入: ["dog","racecar","car"]
输出: ""
解释: 输入不存在公共前缀。

思路：
 */
public class O_Ten_最长公共前缀 {

	
	/*
	 * 1.先找到两个字符串的最长公共前缀，作为当前prefix，再找prefix和第三个字符串的最长公共前缀，以此遍历
	 */
	public static String longestCommonPrefix(String[] strs) {
	    if(strs == null || strs.length == 0)
	    	return "";
	    String prefix = strs[0];
	    for(int i = 0; i < strs.length; i++){
	    	//indexOf 返回指定字符在字符串中第一次出现处的索引
	    	//返回一个整数值，指出String对象内字符串的开始位置，如果没有找到字符串，则返回-1
	    	//System.out.println(strs[1].indexOf("fl")); 为0时: 字符在字符串中第一次出现是在刚开始 下标为0
	    	while(strs[i].indexOf(prefix)!= 0){
	    		//substring(开始位置索引，结束位置索引)
	    		prefix = prefix.substring(0, prefix.length() - 1);
	    		System.out.println("截取后的字符串：" + prefix);
	    		if(prefix.isEmpty())
	    			return "";
	    	}
	    }
		return prefix;
    }
	
	/*
	 * 用strs[0]中的每个字符一个个和后面的字符串对比，从左到右，比较各个字符串相同位置的字符是否相等
	 */
	public static String longestCommonPrefix2(String[] strs) {
		
		if(strs == null || strs.length == 0) return "";
		//纵向对比，用strs[0]中的每个字符一个个和后面得字符串比较
		for (int i = 0; i < strs[0].length(); i++) {
			//返回指定索引处的字符。
			char c = strs[0].charAt(i);
			//第2,,,n个字符串
			for (int j = 1; j < strs.length; j++) {
				//两个字符串相等或者同一位置字符串匹配
				if (i == strs[j].length() || strs[j].charAt(i)!= c) 
					return strs[0].substring(0,i);
			}
		}
		return strs[0];
	}
	
	public static void main(String[] args) {
		String []strs = {"flower","flow","flight"};
		System.out.println("最长公共前缀为：" + longestCommonPrefix2(strs));
	    /*System.out.println(strs[1].indexOf("fl"));*/
	}
}
