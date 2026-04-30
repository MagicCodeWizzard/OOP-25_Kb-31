package com.college.oop.generics;

import java.lang.reflect.Array;

public class GenericListNode<R> {
    private GenericListNode<R> prev;
    private GenericListNode<R> next;

    private R value;


    public GenericListNode() {
    }

    public GenericListNode(GenericListNode<R> prev, GenericListNode<R> next, R value) {
        this.prev = prev;
        this.next = next;
        this.value = value;
    }

    public R getValue() {
        return value;
    }

    public void setValue(R value) {
        this.value = value;
    }

    public GenericListNode<R> getNext() {
        return next;
    }

    public void setNext(GenericListNode<R> next) {
        this.next = next;
    }

    public GenericListNode<R> getPrev() {
        return prev;
    }

    public void setPrev(GenericListNode<R> prev) {
        this.prev = prev;
    }
}
