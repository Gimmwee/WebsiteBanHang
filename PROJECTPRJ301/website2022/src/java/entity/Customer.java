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
public class Customer {

    private String user;
    private String Pass;
    private String phone;
    private int isAdmin;

    public Customer() {
    }

    public Customer(String user, String Pass, String phone, int isAdmin) {
        this.user = user;
        this.Pass = Pass;
        this.phone = phone;
        this.isAdmin = isAdmin;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return Pass;
    }

    public void setPass(String Pass) {
        this.Pass = Pass;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(int isAdmin) {
        this.isAdmin = isAdmin;
    }

    @Override
    public String toString() {
        return "Customer{" + "user=" + user + ", Pass=" + Pass + ", phone=" + phone + ", isAdmin=" + isAdmin + '}';
    }

    
}
