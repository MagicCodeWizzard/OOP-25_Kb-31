package com.college.oop.patterns;

public class Builder {
    private Student obj = null;

    private void startCretion()
    {
        obj = new Student();
    }

    public Builder addAge(int age)
    {
        if (obj == null) {
            startCretion();
        }

        obj.age = age;

        return this;
    }

    public Builder setName(String name)
    {
        if (obj == null) {
            startCretion();
        }

        obj.name = name;

        return this;
    }

    public Student build()
    {
        if (obj == null) {
            startCretion();
        }

        return build();
    }
}
