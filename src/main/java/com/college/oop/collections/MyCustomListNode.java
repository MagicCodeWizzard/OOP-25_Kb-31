package com.college.oop.collections;

public class MyCustomListNode {
    private double value;
    private MyCustomListNode next = null;

    public MyCustomListNode() {
    }

    public MyCustomListNode(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public MyCustomListNode getNext() {
        return next;
    }

    public void setNext(MyCustomListNode next) {
        this.next = next;
    }
}
