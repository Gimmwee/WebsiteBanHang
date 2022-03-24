/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import context.DBConnect;
import entity.OrdersDetail;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class OrdersDetailDAO {

    public static Connection conn = null;
    public static PreparedStatement ps = null;
    public static ResultSet rs = null;

    public static boolean createAnOrderDetailProduct(int orderID, int productID, int quantity) throws Exception {
        try {
            conn = new DBConnect().getConnection();

            if (conn != null) {
                String sql = "insert into OrdersDetail values (?, ?, ?)";

                ps = conn.prepareStatement(sql);
                ps.setInt(1, orderID);
                ps.setInt(2, productID);
                ps.setInt(3, quantity);
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

    public static ArrayList<OrdersDetail> getListOrderProduct(int orderID) throws SQLException {
        ArrayList<OrdersDetail> listOrderDetail = new ArrayList<>();

        String query = "select * from OrdersDetail where orderID = ?";
        try {
            conn = new DBConnect().getConnection();

            if (conn != null) {
                ps = conn.prepareStatement(query);
                ps.setInt(1, orderID);

                rs = ps.executeQuery();
                while (rs.next()) {
                    listOrderDetail.add(new OrdersDetail(rs.getInt("orderID"), rs.getInt("productID"), rs.getInt("quantity")));

                }
                return listOrderDetail;

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

    //lấy list ordersdetail
    public List<OrdersDetail> getAllOrdersDetail() {
        List<OrdersDetail> list = new ArrayList<>();
        String query = " select * from OrdersDetail ";
        try {
            conn = new DBConnect().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);// truyen cau len query sang sql sever
            rs = ps.executeQuery(); // chay cau lenh query va tra ve bang ket qua
            while (rs.next()) {
                list.add(new OrdersDetail(
                        rs.getInt(1),
                        rs.getInt(2),
                        rs.getInt(3)));

            }
        } catch (Exception e) {
        }
        return list;
    }

    //lấy list product order
    public static boolean updateQuantity(int orderID, int productID, int quantity) throws SQLException {

        String query = "update OrdersDetail set quantity = ? where orderID = ? and productID  = ?";
        try {
            conn = new DBConnect().getConnection();

            if (conn != null) {
                ps = conn.prepareStatement(query);
                ps.setInt(1, quantity);
                ps.setInt(2, orderID);
                ps.setInt(3, productID);
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

    //lấy list product order
    public static boolean deleteProductAddtoCard(int orderID, int productID) throws SQLException {

        String query = "delete from OrdersDetail where orderID = ? and productID = ?";
        try {
            conn = new DBConnect().getConnection();

            if (conn != null) {
                ps = conn.prepareStatement(query);
                ps.setInt(1, orderID);
                ps.setInt(2, productID);
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

    public static void main(String[] args) throws Exception {
//        System.out.println(createAnOrderDetailProduct(1, 2, 5));
//        System.out.println(getListOrderProduct(1));
//        System.out.println(updateQuantity(1, 2, 10));
        System.out.println(deleteProductAddtoCard(1, 2));
    }
}
