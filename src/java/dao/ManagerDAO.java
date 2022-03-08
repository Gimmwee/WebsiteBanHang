/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import context.DBConnect;
import entity.Product;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Son
 */
public class ManagerDAO {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public void DeleteProduct(String pid) {

        String query = " delete from Product \n"
                + "where idProduct = ? ";
        try {
            conn = new DBConnect().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);// truyen cau len query sang sql sever
            ps.setString(1, pid);
            ps.executeUpdate(); // chay cau lenh query va tra ve bang ket qua

        } catch (Exception e) {
        }
    }

    public void InsertProduct(String title,
            String name,
            String detail,
            String price,
            String image,
            String category) {

        String query = " insert into Product VALUES (?,?,?,?,?,?)";
        try {
            conn = new DBConnect().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);// truyen cau len query sang sql sever
            ps.setString(1, title);
            ps.setString(2, name);
            ps.setString(3, detail);
            ps.setString(4, price);
            ps.setString(5, image);
            ps.setString(6, category);
            ps.executeUpdate(); // chay cau lenh query va tra ve bang ket qua

        } catch (Exception e) {
        }
    }
}
