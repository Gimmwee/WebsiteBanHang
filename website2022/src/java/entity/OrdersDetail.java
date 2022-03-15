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
public class OrdersDetail {
    
    private int idOD,ido,pid;
    private int quantity;
    private double price;

    public OrdersDetail() {
    }

    public OrdersDetail(int idOD, int ido, int pid, int quantity, double price) {
        this.idOD = idOD;
        this.ido = ido;
        this.pid = pid;
        this.quantity = quantity;
        this.price = price;
    }

    public int getIdOD() {
        return idOD;
    }

    public void setIdOD(int idOD) {
        this.idOD = idOD;
    }

    public int getIdo() {
        return ido;
    }

    public void setIdo(int ido) {
        this.ido = ido;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "OrdersDetail{" + "idOD=" + idOD + ", ido=" + ido + ", pid=" + pid + ", quantity=" + quantity + ", price=" + price + '}';
    }
    
    
    
    
}
