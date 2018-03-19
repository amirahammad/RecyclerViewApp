package tasks.com.recyclerviewapp;

/**
 * Created by Freeware Sys on 18/03/2018.
 */

public class Product {
    private int id;
    private String title;
    private String shortdesc;
    private double rating;
    private double price;
    private int image;

    public Product(int id, int image, double price, double rating, String shortdesc, String title) {
        this.id = id;
        this.image = image;
        this.price = price;
        this.rating = rating;
        this.shortdesc = shortdesc;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public int getImage() {
        return image;
    }

    public double getPrice() {
        return price;
    }

    public double getRating() {
        return rating;
    }

    public String getShortdesc() {
        return shortdesc;
    }

    public String getTitle() {
        return title;
    }
}

