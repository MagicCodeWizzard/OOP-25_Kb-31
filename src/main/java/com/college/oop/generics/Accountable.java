package com.college.oop.generics;

public interface Accountable<T> {
    public T getSummary();
    public void setSummary(T value);
}
