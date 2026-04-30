package com.college.oop.generics;

public class ListNode {
    private ListNode prev;
    private ListNode next;
    private Object value;

    public ListNode() {
    }

    public ListNode(ListNode prev, ListNode next, Object value) {
        this.prev = prev;
        this.next = next;
        this.value = value;
    }

    public ListNode getPrev() {
        return prev;
    }

    public void setPrev(ListNode prev) {
        this.prev = prev;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
