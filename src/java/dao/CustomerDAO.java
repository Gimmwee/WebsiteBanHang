/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import context.DBConnect;
import entity.Customer;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Son
 */
public class CustomerDAO {

    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public Customer login(String user, String pass) {

        Customer cus = null;

        try {

            String sql = " select * from Customer where userName = ? and [passWord] = ?";
            con = new DBConnect().getConnection();//mo ket noi voi sql
            ps = con.prepareStatement(sql);

            ps.setString(1, user);
            ps.setString(2, pass);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                cus = new Customer();

                cus.setUser(rs.getString("userName"));
                cus.setPass(rs.getString("passWord"));
                cus.setName(rs.getString("nameCustomer"));
                cus.setDOB(rs.getString("DOB"));
                cus.setAddress(rs.getString("Address"));
                cus.setPhone(rs.getString("Phone"));

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return cus;
    }

}
