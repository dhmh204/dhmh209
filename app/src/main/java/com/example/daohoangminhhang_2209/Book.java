package com.example.daohoangminhhang_2209;

public class Book {
    private String name;
    private String description;
    int img;

    public Book(int img, String description, String name) {
        this.img = img;
        this.description = description;
        this.name = name;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
