
package entity;

import java.sql.Date;
import java.util.ArrayList;

public class Orders {
  
    private int orderID;
    private String userName;
    private float total;
    private int isPay;
    private Date createDate;

    public Orders() {
    }
    
    ArrayList<OrdersDetail> listCustomerOrderProduct = new ArrayList<>();

    public Orders(int orderID, String userName, float total, int isPay, Date createDate) {
        this.orderID = orderID;
        this.userName = userName;
        this.total = total;
        this.isPay = isPay;
        this.createDate = createDate;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public int getIsPay() {
        return isPay;
    }

    public void setIsPay(int isPay) {
        this.isPay = isPay;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public ArrayList<OrdersDetail> getListCustomerOrderProduct() {
        return listCustomerOrderProduct;
    }

    public void setListCustomerOrderProduct(ArrayList<OrdersDetail> listCustomerOrderProduct) {
        this.listCustomerOrderProduct = listCustomerOrderProduct;
    }

    @Override
    public String toString() {
        return "Orders{" + "orderID=" + orderID + ", userName=" + userName + ", total=" + total + ", isPay=" + isPay + ", createDate=" + createDate + '}';
    }

   

   
    
    
}
