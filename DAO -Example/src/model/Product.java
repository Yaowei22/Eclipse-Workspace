package model;

/**
 * This class represents a Product that is stored in the database
 *
 */
public class Product {
	long productId;
	String productName;
	String productDescription;
	
	
	//Getters and Setters
	public long getProductId() {
		return productId;
	}
	public void setProductId(long productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	
	
}
