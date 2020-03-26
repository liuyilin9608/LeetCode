package com.lyl.leetcode;

import java.util.Stack;
/*给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。

有效字符串需满足：

左括号必须用相同类型的右括号闭合。
左括号必须以正确的顺序闭合*/
public class O_Four {
    
	public static boolean isValid(String s) {
		 /*左半边的括号全都压栈，判断右括号
                （1）栈为空前面什么也没有时返回false （不为空则继续判断）
		（2）不是对称就是相邻  压栈之前判断栈顶元素是否是左半边括号 栈顶不是坐括号返回false*/ 
		Stack<Character> stack = new Stack<Character>();
		for (char c : s.toCharArray()) {
			switch (c) {
			case ')':
				if (stack.isEmpty() || stack.pop() != '(')
					return false;
				break;
			case ']':
				if (stack.isEmpty() || stack.pop() != '[')
					return false;
				break;
			case '}':
				if (stack.isEmpty() || stack.pop() != '{')
					return false;
				break;
			default:
				stack.push(c);
				break;
			}
		}
		return stack.empty();
	}

	public static void main(String[] args) {
		String str1 = "()";
		String str2 = "()[]{}";
		String str3 = "(]";
		String str4 = "([)]";
		String str5 = "{[]}";
		System.out.println(isValid(str1));
		System.out.println(isValid(str2));
		System.out.println(isValid(str3));
		System.out.println(isValid(str4));
		System.out.println(isValid(str5));
	}

}
