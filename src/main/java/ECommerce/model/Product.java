package ECommerce.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.web.multipart.MultipartFile;




@Entity
@Table
public class Product {

	
	@Id
	@GeneratedValue

	int productId;
	String productName;
	String productDesc;
	int productPrice;
	int productStock;
	int categoryId;
	int supplierId;
	
	@Transient
	MultipartFile pimage;
	

	public MultipartFile getPimage() {
		return pimage;
	}

	public void setPimage(MultipartFile pimage) {
		this.pimage = pimage;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductDesc() {
		return productDesc;
	}

	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}

	public int getproductPrice() {
		return productPrice;
	}

	public void setproductPrice(int price) {
		this.productPrice= price;
	}

	public int getproductStock(int Price) {
		return Price;
	}

	public void setproductStock(int stock) {
		this.productStock = stock;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public int getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(int supplierId) {
		this.supplierId = supplierId;
	}

}
