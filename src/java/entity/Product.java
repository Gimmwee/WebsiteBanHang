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
    private int idP;
    private String name;
    private String detail;
    private double price;
    private String image;

    public Product() {
    }

    public Product(int idP, String name, String detail, double price, String image) {
        this.idP = idP;
        this.name = name;
        this.detail = detail;
        this.price = price;
        this.image = image;
    }

    public int getIdP() {
        return idP;
    }

    public void setIdP(int idP) {
        this.idP = idP;
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
        return "product{" + "idP=" + idP + ", name=" + name + ", detail=" + detail + ", price=" + price + ", image=" + image + '}';
    }
    
    
    
    
       
}
