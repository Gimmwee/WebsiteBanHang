/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author Son
 */
public class Product {
    private int id;
    private String title;
    private String name;
    private String detail;
    private double price;
    private String image;

    public Product() {
    }

    public Product(int id, String title, String name, String detail, double price, String image) {
        this.id = id;
        this.title = title;
        this.name = name;
        this.detail = detail;
        this.price = price;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", title=" + title + ", name=" + name + ", detail=" + detail + ", price=" + price + ", image=" + image + '}';
    }

   
    
    
}
