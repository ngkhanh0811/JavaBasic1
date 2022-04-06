package Java14.ex2;

import Java14.ex1.Author;

public class Book {
    private String name;
    private double price;
    private int qty;
    private Author author;

    public Book(String name, double price, int qty, Author author){
        this.name=name;
        this.price=price;
        this.qty=qty;
        this.author=author;
    }

    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }

    public int getQty(){
        return qty;
    }

    public Author getAuthor(){
        return author;
    }

    void setPrice(double price){
        this.price = price;
    }

    void setQty(int qty){
        this.qty = qty;
    }

    public String toString(){
        return "'" + getName() + "'" + " by " + getAuthor();
    }
}
