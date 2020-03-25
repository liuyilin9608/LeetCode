package com.lyl.leetcode;
//谁小就赋值给他的下一个
class ListNode{

	int val;
	ListNode next;
	public ListNode(int x) {
		val = x;
	}
	public int getVal() {
		return val;
	}
	public void setVal(int val) {
		this.val = val;
	}
	public ListNode getNext() {
		return next;
	}
	public void setNext(ListNode next) {
		this.next = next;
	}
	
}

public class O_Three {
	
	public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(2);
		ListNode a = new ListNode(3);
		ListNode b = new ListNode(4);
		ListNode c = new ListNode(5);
		ListNode d = new ListNode(6);
		ListNode e = new ListNode(7);
		ListNode f = new ListNode(8);
		ListNode g = new ListNode(9);
		ListNode h = new ListNode(10);
		l1.setNext(a);
		a.setNext(c);
		c.setNext(e);
		e.setNext(g);
		l2.setNext(b);
		b.setNext(d);
		d.setNext(f);
		f.setNext(h);
		ListNode one = l1;
		System.out.print("链表1：");
		while(one != null){
			System.out.print(one.getVal() + " ") ;
			//将下一个节点设置为当前节点s
			one = one.getNext();
		}
		System.out.println();
		System.out.print("链表2：");
		ListNode two = l2;
		while(two != null){
			System.out.print(two.getVal() + " ");
			two = two.getNext();
		}
		System.out.println();
		System.out.print("合并递增链表：");
		ListNode merge = mergeTwoList(one, two);
		
		while(merge != null){
			System.out.println(merge.getVal() + " ");
			merge = merge.next;
		}
	}
	public static ListNode mergeTwoList(ListNode l1, ListNode l2) {

        // 递归结束条件
        if (l1 == null)
            return l2;
        if (l2 == null)
            return l1;

        // 左链单个数据小于右链单个数据，将左链的当前数据的后链，与右链进行递归
        if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }
	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode head = new ListNode(0);
		ListNode index = head;
		while(l1!=null || l2!=null){
			if(l1 == null){
				index.next = l2;
				break;
			}
			if(l2 == null){
				index.next = l1;
				break;
			}
			if(l1.val < l2.val){
				index.next = l1;
				l1 = l1.next;
			}else{
				index.next = l2;
				l2 = l2.next;
			}
			index = index.next;
		}
		return head.next;
	}
}
