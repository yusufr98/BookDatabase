package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static ArrayList<Book> books = new ArrayList<>();

    public static void main(String[] args) {
        books.add(new Book("Java1001", "Head First Java", "Kathy Sierra and Bert Bates", "Easy to read Java workbook", 47.50, true));
        books.add(new Book("Java1002", "Thinking in Java", "Bruce Eckel", "Details about Java under the hood", 20, true));
        books.add(new Book("Orcl1003", "OCP:Oracle Certified Professional Java SE", "Jeanne Boyarsky", "Everything you need to know in one place", 45,true ));
        books.add(new Book("Python1004", "Automate the Boring Stuff with Python", "Al Sweigart", "Fun with Python", 10.50, true));
        books.add(new Book("Zombie1005", "The Maker's Guide to the Zombie Apocalypse", "Simon Monk", "Defend Your Base with Simple Circuits, Arduino, and Rasberry Pi!", 14.75, true));
        books.add(new Book("Rasp1006", "Raspberry Pi Projects for the Evil Genius", "Donald Norris", "A dozen fiendishly fun projects for the Raspberry Pi!", 14.75, true));
        Scanner k = new Scanner(System.in);
        System.out.print("Enter a SKU:");
        String sku = k.nextLine();
        if(find(sku) != null){
            System.out.println(find(sku).getTitle());
        }
        else{
            System.out.println("Book could not be found.");
        }
    }
    public static Book find(String sku){
        for(Book b : books){
            if(b.getSku().equalsIgnoreCase(sku)){
                return b;
            }
        }
        return null;
    }
}
