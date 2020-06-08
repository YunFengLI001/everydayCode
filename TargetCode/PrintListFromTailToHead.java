package com.haha.jianzhioffer;

import java.util.ArrayList;

/*
输入一个链表，按链表从尾到头的顺序返回一个ArrayList。
 */
public class PrintListFromTailToHead {
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList list = new ArrayList<String>();
        ListNode head = null;
        while(listNode.next!=null){
            head = listNode.next;
            head.next = listNode;
            listNode = listNode.next;
        }
        return list;
    }
    public static void main(String[] args) {

    }




}
