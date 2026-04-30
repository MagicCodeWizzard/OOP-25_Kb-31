package com.college.oop.generics;

public class PeopleListNode<R, T extends R> {
    private PeopleListNode<R, T> prev;
    private PeopleListNode<R, T> next;

    private T value;

    Object[] my_array;

    public PeopleListNode() {
        my_array = new Object[30];
    }

    void setObject(T obj, int i)
    {
        my_array[i] = obj;
    }

    T getObject(int i)
    {
        if (my_array[i] == null) {
            return null;
        }
        return (T)my_array[i];
    }

}
