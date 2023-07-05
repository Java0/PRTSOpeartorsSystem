package com.goodtime.arkbackend.entity;

public class OperatorArchive {
    private String id;
    private Integer order;
    private String title;
    private String text;

    public OperatorArchive(String id, Integer order, String title, String text) {
        this.id = id;
        this.order = order;
        this.title = title;
        this.text = text;
    }

    public OperatorArchive(Integer order, String title, String text) {
        this.order = order;
        this.title = title;
        this.text = text;
    }

    public OperatorArchive(String id, Integer order) {
        this.id = id;
        this.order = order;
    }

    public OperatorArchive() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "OperatorArchive{" +
                "id='" + id + '\'' +
                ", order=" + order +
                ", title='" + title + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
