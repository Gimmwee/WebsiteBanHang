/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import context.DBConnect;
import entity.Orders;
import entity.OrdersDetail;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class OrdersDAO {

    public static Connection conn = null;
    public static PreparedStatement ps = null;
    public static ResultSet rs = null;

    //Trả về orders nếu có tồn tại 
    public static Orders isHaveOrder(String userName) throws SQLException {

        String query = "select * from Orders where userName = ? and isPay = 0";
        String user = null;
        Orders customerOrder = new Orders();
        try {
            conn = new DBConnect().getConnection();

            if (conn != null) {
                ps = conn.prepareStatement(query);
                ps.setString(1, userName);

                rs = ps.executeQuery();
                if (rs.next()) {
                    customerOrder.setOrderID(rs.getInt("orderID"));
                    customerOrder.setUserName(rs.getString("userName"));
                    customerOrder.setCreateDate(rs.getDate("createDate"));
                    customerOrder.setTotal(rs.getFloat("total"));
                    customerOrder.setIsPay(rs.getInt("isPay"));
                    return customerOrder;
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (ps != null) {
                ps.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
        return null;
    }

    public static boolean addToCart(String userName) throws Exception {
        try {
            conn = new DBConnect().getConnection();

            if (conn != null) {
                String sql = "insert into Orders(userName, isPay, createDate) values (?,0,?)";

                ps = conn.prepareStatement(sql);
                ps.setString(1, userName);
                ps.setString(2, LocalDateTime.now().toString());
                int row = ps.executeUpdate();

                return row > 0;
            }
        } catch (Exception e) {
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (ps != null) {
                ps.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
        return false;
    }

    public static boolean confirmOrder(int orderID, String userName, float billTotal) throws SQLException {

        String query = "update Orders set isPay = 1, total = ? where orderID = ? and userName = ?";
        String user = null;
        Orders customerOrder = new Orders();
        try {
            conn = new DBConnect().getConnection();

            if (conn != null) {
                ps = conn.prepareStatement(query);
                ps.setFloat(1, billTotal);
                ps.setInt(2, orderID);
                ps.setString(3, userName);

                int row = ps.executeUpdate();
                return row > 0;

            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (ps != null) {
                ps.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
        return false;
    }

    public static ArrayList<Orders> getListConfirmOrder(String userName) throws SQLException {

        ArrayList<Orders> listConfirmOrder = new ArrayList<>();
        String query = "select * from Orders where isPay = 1 and userName = ?";
        Orders customerOrder = new Orders();
        try {
            conn = new DBConnect().getConnection();

            if (conn != null) {
                ps = conn.prepareStatement(query);
                ps.setString(1, userName);

                rs = ps.executeQuery();
                while (rs.next()) {
                    customerOrder.setOrderID(rs.getInt("orderID"));
                    customerOrder.setUserName(rs.getString("userName"));
                    customerOrder.setCreateDate(rs.getDate("createDate"));
                    customerOrder.setTotal(rs.getFloat("total"));
                    customerOrder.setIsPay(rs.getInt("isPay"));
                    listConfirmOrder.add(customerOrder);
                }
                return listConfirmOrder;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (ps != null) {
                ps.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
        return null;
    }

    public static void main(String[] args) throws SQLException, Exception {
        System.out.println(OrdersDAO.isHaveOrder("son"));
//        System.out.println(OrdersDAO.addToCart("son"));
//        System.out.println(confirmOrder(1, "son", 0));

    }
}
