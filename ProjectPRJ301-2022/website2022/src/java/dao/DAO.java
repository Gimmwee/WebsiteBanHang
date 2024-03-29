/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import context.DBConnect;
import entity.Category;
import entity.Product;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.*;

/**
 *
 * @author Son
 */
public class DAO {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public List<Product> getAllProduct() {
        List<Product> list = new ArrayList<>();
        String query = " select * from Product ";
        try {
            conn = new DBConnect().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);// truyen cau len query sang sql sever
            rs = ps.executeQuery(); // chay cau lenh query va tra ve bang ket qua
            while (rs.next()) {
                list.add(new Product(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getDouble(5),
                        rs.getString(6)));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public List<Category> getAllCategory() {
        List<Category> list = new ArrayList<>();
        String query = " select * from Categories ";
        try {
            conn = new DBConnect().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);// truyen cau len query sang sql sever
            rs = ps.executeQuery(); // chay cau lenh query va tra ve bang ket qua
            while (rs.next()) {
                list.add(new Category(rs.getInt(1),
                        rs.getString(2)));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public Product getLast() {
        String query = "select top 1 * from Product\n"
                + " order by idProduct desc";
        try {
            conn = new DBConnect().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Product(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getDouble(5),
                        rs.getString(6));
            }
        } catch (Exception e) {
        }
        return null;
    }

    public List<Product> getProductByCid(String cid) {
        List<Product> list = new ArrayList<>();
        String query = "  select * from Product \n"
                + "where idCategories = ?";
        try {
            conn = new DBConnect().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);// truyen cau len query sang sql sever
            ps.setString(1, cid);
            rs = ps.executeQuery(); // chay cau lenh query va tra ve bang ket qua
            while (rs.next()) {
                list.add(new Product(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getDouble(5),
                        rs.getString(6)));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public Product getProductByid(String cid) {

        String query = " select * from Product \n"
                + "where idProduct = ?";
        try {
            conn = new DBConnect().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);// truyen cau len query sang sql sever
            ps.setString(1, cid);
            rs = ps.executeQuery(); // chay cau lenh query va tra ve bang ket qua
            while (rs.next()) {
                return (new Product(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getDouble(5),
                        rs.getString(6)));
            }
        } catch (Exception e) {
        }
        return null;
    }
    public Product getProductByid(int id) {

        String query = " select * from Product \n"
                + "where idProduct = ?";
        try {
            conn = new DBConnect().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);// truyen cau len query sang sql sever
            ps.setInt(1, id);
            rs = ps.executeQuery(); // chay cau lenh query va tra ve bang ket qua
            while (rs.next()) {
                return (new Product(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getDouble(5),
                        rs.getString(6)));
            }
        } catch (Exception e) {
        }
        return null;
    }

    public List<Product> SearchByName(String txtSearch) {
        List<Product> list = new ArrayList<>();
        String query = " select * from Product\n"
                + "where name like ? ";
        try {
            conn = new DBConnect().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);// truyen cau len query sang sql sever
            ps.setString(1, "%" + txtSearch + "%");
            rs = ps.executeQuery(); // chay cau lenh query va tra ve bang ket qua
            while (rs.next()) {
                list.add(new Product(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getDouble(5),
                        rs.getString(6)));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public Product getProduct(String txt) {
        String query = "select * from product where id = ?";
        List<Product> list = new ArrayList<>();
        try {
            conn = new DBConnect().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, txt);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Product(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getDouble(5),
                        rs.getString(6));

            }
        } catch (Exception e) {
        }
        return null;
    }

    public static void main(String[] args) {
        DAO dao = new DAO();
//        List<Product> list = dao.getAllProduct();

        List<Category> listC = dao.getAllCategory();
        // Product last = dao.getLast();
        //System.out.println(last);
        //List<Product> list = dao.getProductByCid(cid);
        for (Category o : listC) {
            System.out.println(o);
        }
    }

}
