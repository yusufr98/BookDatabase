package com.company;

public class Book {
    private String sku;
    private String title;
    private String author;
    private String description;
    private double price;
    private boolean isInStock;

    public Book(String sku, String title, String author, String description, double price, boolean isInStock) {
        this.title = title;
        this.author = author;
        this.description = description;
        this.price = price;
        this.isInStock = isInStock;
        this.sku = sku;
    }

    public Book() {
    }

    public void getDisplayText(){
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
        System.out.println("Description: " + this.description);
    }
    public double total(int n){
        if(isInStock)
        {
            return this.price*n;
        }
        else{
            System.out.println("This book is not in stock.");
            return 0;
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isInStock() {
        return isInStock;
    }

    public void setInStock(boolean inStock) {
        isInStock = inStock;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }
}
