/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author doson
 */
public class Product {
    private int idProduct;
    private String name;
    private String detail;
    private int price;
    private String image;
    private Categories cate;

    public Product() {
    }

    public Product(int idProduct, String name, String detail, int price, String image, Categories cate) {
        this.idProduct = idProduct;
        this.name = name;
        this.detail = detail;
        this.price = price;
        this.image = image;
        this.cate = cate;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Categories getCate() {
        return cate;
    }

    public void setCate(Categories cate) {
        this.cate = cate;
    }

    
    
    
}
