package com.college.oop.inheritance.model;

import java.util.Arrays;

public class Document {
    private String title;
    private Employee author;
    private String description;
    private Employee[] signatories;

    public Document() {
    }

    public Document(String title, Employee author, String description, Employee[] signatories) {
        this.title = title;
        this.author = author;
        this.description = description;
        this.signatories = signatories;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Employee getAuthor() {
        return author;
    }

    public void setAuthor(Employee author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Employee[] getSignatories() {
        return signatories;
    }

    public void setSignatories(Employee[] signatories) {
        this.signatories = signatories;
    }

    @Override
    public String toString() {
        return "Document{" +
                "title='" + title + '\'' +
                ", author=" + author +
                ", description='" + description + '\'' +
                ", signatories=" + Arrays.toString(signatories) +
                '}';
    }
}
