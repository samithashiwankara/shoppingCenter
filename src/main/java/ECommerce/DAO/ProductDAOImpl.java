package ECommerce.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ECommerce.model.Category;
import ECommerce.model.Product;

@Repository("productDAO")
@Transactional

public class ProductDAOImpl  implements ProductDAO{

	@Autowired
	SessionFactory sessionFactory;
	
	
	public boolean addProduct(Product product) {
		try {
			sessionFactory.getCurrentSession().save(product);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}

	
	public boolean deleteProduct(Product product) {
		try {
			sessionFactory.getCurrentSession().delete(product);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}

	
	public boolean updateProduct(Product product) {
		try {
			sessionFactory.getCurrentSession().update(product);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}

	public List<Product> listproduct() {
		Session session = sessionFactory.openSession();
		Query query = session.createQuery("from Product");
		List<Product> listProduct = query.list();
		session.close();
		
		return listProduct;
	}

	public Product getProduct(int productId) {
		Session session = sessionFactory.openSession();
		Product product= session.get(Product.class, productId);
		return product;
	}

}
