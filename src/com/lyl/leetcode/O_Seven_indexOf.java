package com.lyl.leetcode;
/**
 *实现 strStr() 函数。
给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如果不存在，则返回-1。
示例 1:
输入: haystack = "hello", needle = "ll"
输出: 2
示例 2:
输入: haystack = "aaaaa", needle = "bba"
输出: -1
 */

/*
indexOf(int ch): 
返回指定字符在字符串中第一次出现处的索引，如果此字符串中没有这样的字符，则返回 -1。
indexOf(int ch, int fromIndex): 
返回从 fromIndex 位置开始查找指定字符在字符串中第一次出现处的索引，如果此字符串中没有这样的字符，则返回 -1。
 */
public class O_Seven_indexOf {

	public static int strStr(String haystack, String needle) {
		
		return haystack.indexOf(needle);
	}
	
}
