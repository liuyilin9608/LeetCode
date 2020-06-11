package com.lyl.leetcode;

/*
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。

 示例 1:
 输入: 121
 输出: true
 示例 2:
 输入: -121
 输出: false
 解释: 从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
 示例 3:
 输入: 10
 输出: false
 解释: 从右向左读, 为 01 。因此它不是一个回文数。
 */
public class O_Eight_回文数 {

	public static boolean isPalindrome(int x) {
		// 整数转化为字符串
		String xStr = String.valueOf(x);
		StringBuilder stringBuilder = new StringBuilder(xStr);
		// StringBuilder下的字符串反转方法reverse()， 相同则是回文数
		if (xStr.equals(stringBuilder.reverse().toString())) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isPalindrome2(int x) {

		int reverse = 0;
		// 最后一位不能是0，否则第一位就得是0了 不可能
		if (x < 0 || (x != 0 && x % 10 == 0)) {
			return false;
		}
		while (x > reverse) {
			reverse = reverse * 10 + x % 10;
			x /= 10;
		}
		 // 当数字长度为奇数时，我们可以通过 revertedNumber/10 去除处于中位的数字。
        // 例如，当输入为 12321 时，在 while 循环的末尾我们可以得到 x = 12，revertedNumber = 123，
        // 由于处于中位的数字不影响回文（它总是与自己相等），所以我们可以简单地将其去除。
		//区分奇数偶数  12321， 11
		if (x == reverse || x == reverse / 10) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		int x = 121;
		System.out.println(isPalindrome(x));
		System.out.println(isPalindrome2(x));
	}
}
