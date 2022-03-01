
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Categories;
import model.Product;


public class ProductDAO extends DBContext {

    public List<Product> getAllProduct() {
        List<Product> list = new ArrayList<>();
        String sql = "select * from Product p inner join Categories c on p.idCategories = c.idCategories";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Categories c = new Categories(rs.getInt(7), rs.getString(8));
                list.add(new Product(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5), c));
            }
        } catch (Exception e) {

        }
        return list;
    }

    public List<Product> getByCategorisId(int id) {
        List<Product> list = new ArrayList<>();
        String sql = "select * from Product p inner join Categories c on p.idCategories = c.idCategories where p.idCategories = ?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, id);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Categories c = new Categories(rs.getInt(7), rs.getString(8));
                list.add(new Product(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5), c));
            }
        } catch (Exception e) {

        }
        return list;
    }

    public List<Product> getByPage(List<Product> list, int start, int end) {
        List<Product> listByPage = new ArrayList<>();
        for (int i = start; i < end; i++) {
            listByPage.add(list.get(i));
        }
        return listByPage;
    }

    public List<Product> SearchByName(String key) {
        List<Product> search = new ArrayList<>();
        String sql = "select * from Product p inner join Categories c on p.idCategories = c.idCategories where p.name like ? or p.detail like ?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, "%" + key + "%");
            st.setString(2, "%" + key + "%");
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Categories c = new Categories(rs.getInt(7), rs.getString(8));
                search.add(new Product(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5), c));
            }
        } catch (Exception e) {
        }
        return search;
    }

    public Product getProductById(int id) {
        String sql = "select * from Product p inner join Categories c on p.idCategories = c.idCategories where idProduct=?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, id);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                Categories c = new Categories(rs.getInt(7), rs.getString(8));
                return new Product(id, rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5), c);
            }
        } catch (Exception e) {
        }
        return null;
    }

    public void addProduct(Product s) {
        String sql = "insert into Product values(?,?,?,?,?)";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, s.getName());
            st.setString(2, s.getDetail());
            st.setInt(3, s.getPrice());
            st.setString(4, s.getImage());
            st.setInt(5, s.getCate().getIdCategories());
            st.executeUpdate();
        } catch (SQLException e) {
        }
    }

    public void deleteProduct(int id) {
        String sql = "delete from Product where idProduct=?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, id);
            st.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public void update(Product c) {
        String sql = "update Product set price=?,detail=? where idProduct=?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, c.getPrice());
            st.setString(2, c.getDetail());
            st.setInt(3, c.getIdProduct());
            st.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
