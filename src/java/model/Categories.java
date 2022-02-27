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
public class Categories {
    private int idCategories;
    private String nameCategories;

    public Categories() {
    }

    public Categories(int idCategories, String nameCategories) {
        this.idCategories = idCategories;
        this.nameCategories = nameCategories;
    }

    public int getIdCategories() {
        return idCategories;
    }

    public void setIdCategories(int idCategories) {
        this.idCategories = idCategories;
    }

    public String getNameCategories() {
        return nameCategories;
    }

    public void setNameCategories(String nameCategories) {
        this.nameCategories = nameCategories;
    }
    
}
