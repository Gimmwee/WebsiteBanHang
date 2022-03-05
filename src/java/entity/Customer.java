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
    private String name;
    private String DOB;
    private String Address;
    private String phone;

    public Customer() {
    }

    public Customer(String user, String Pass, String name, String DOB, String Address, String phone) {
        this.user = user;
        this.Pass = Pass;
        this.name = name;
        this.DOB = DOB;
        this.Address = Address;
        this.phone = phone;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Customer{" + "user=" + user + ", Pass=" + Pass + ", name=" + name + ", DOB=" + DOB + ", Address=" + Address + ", phone=" + phone + '}';
    }
    
    
  
}
