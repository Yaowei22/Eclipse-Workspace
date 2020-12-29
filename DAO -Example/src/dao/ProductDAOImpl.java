package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Product;

public class ProductDAOImpl implements ProductDAO {

	@Override
	public List<Product> getProducts() {
		List<Product> products = new ArrayList<Product>();
		try {
			Connection conn = ConnectionUtility.getConnection();
			String sql = "SELECT * FROM PRODUCTS";
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()){
				long id = rs.getLong(1);
				String name = rs.getString(2);
				String desc = rs.getString(3);
				
				Product p = new Product();
				p.setProductId(id);
				p.setProductName(name);
				p.setProductDescription(desc);
				products.add(p);
			}
			conn.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

		return products;
	}

	@Override
	public void addProduct(Product product) {
		try {
			Connection conn = ConnectionUtility.getConnection();
			String sql = "INSERT INTO products VALUES(?,?,?)";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setLong(1, product.getProductId());
			ps.setString(2, product.getProductName());
			ps.setString(3, product.getProductDescription());
			ps.executeUpdate();
			System.out.println("Product added successfully!");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void deleteProduct(Product product) {
		// TODO You can implement this method on your own

	}

	@Override
	public void updateProduct(Product product) {
		// TODO You can implement this method on your own

	}

}