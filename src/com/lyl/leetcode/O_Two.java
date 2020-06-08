package com.lyl.leetcode;

/*
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
示例 1:
输入: 123
输出: 321
 示例 2:
输入: -123
输出: -321
示例 3:
输入: 120
输出: 21
 */
public class O_Two {

	/**
	 * 字符串反转Line 9: java.lang.NumberFormatException: For input string:
	 * "9646324351" 自己
	 */
	public static int reverses(int x) {
		StringBuilder s = new StringBuilder();
		String str = String.valueOf(x); //整型转化为字符串类型
		try {
			if (x > 0) {
				for (int i = str.length() - 1; i >= 0; i--) {
					s.append(str.charAt(i));
				}
				int y = Integer.parseInt(s.toString()); //字符串类型转化为整型
				return y;
			} else {
				String sb = str.substring(1);
				System.out.println(sb);
				for (int i = sb.length() - 1; i >= 0; i--) {
					s.append(sb.charAt(i));
				}
				String dsb = s.toString();
				if (!dsb.equals("") && null != dsb) {
					int z = Integer.parseInt(s.toString());
					int b = z * -1;
					return b;
				}
				return x;
			}
		} catch (NumberFormatException e) {
			return 0;
		}
	}

	// 修改字符串方法
	public static int reverse(int x) {
		StringBuffer buf = new StringBuffer();
		int y = Math.abs(x); // 求绝对值
		String s = String.valueOf(y);
		char[] ch = s.toCharArray();  //字符串转化为数组
		for (int i = ch.length - 1; i >= 0; i--) {
			buf.append(ch[i]);
		}
		String str = buf.toString();
		try {
			int num = Integer.parseInt(str);
			if (x >= 0)
				x = num;
			if (x < 0)
				x = -num;
			return x;
		} catch (NumberFormatException e) {
			return 0;
		}
	}

	public static int reverse2(int x) {
		long number = 0;
		while (x != 0) {
			number = number * 10 + x % 10;
			x = x / 10;
		}
		if(number>Integer.MAX_VALUE || number<Integer.MIN_VALUE){
            return 0;
        }
		//long——》int
        return  (int)number;
	}

	public static void main(String[] args) {
		int result = reverses(123);
		int results = reverse(123);
		int result2 = reverse2(123456789);
		System.out.println(result);
		System.out.println(results);
		System.out.println(result2);
	}
}
