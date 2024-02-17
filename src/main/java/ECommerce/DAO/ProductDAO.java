package ECommerce.DAO;

import java.util.List;

import ECommerce.model.Category;
import ECommerce.model.Product;

public interface ProductDAO {

	
    public boolean addProduct(Product product);
	public boolean deleteProduct(Product product);
	public boolean updateProduct(Product product);
	
	public List<Product> listproduct();
	public  Product getProduct(int productId) ;
		
		
		

	
}
