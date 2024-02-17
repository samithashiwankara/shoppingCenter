package ECommerce.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import ECommerce.DAO.ProductDAO;
import ECommerce.model.Product;

public class ProductJunitTest {

static ProductDAO productDAO;
	
	@BeforeClass 
	public static void executeFirst()
	{
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("ECommerce");
		context.refresh();
		
		productDAO =(ProductDAO )context.getBean("productDAO");
		
	}
	
	@Test
	
	public void addProductTest()
	{
		Product product = new Product();
		product.setProductName("T-shirt");
		product.setProductDesc("United Colours of Bentton");
		product.setproductPrice(800);
		product.setproductStock(45);
		product.setCategoryId(18);
		product.setSupplierId(15);
		
		assertTrue("Problem in adding Product",productDAO.addProduct(product));
		
	}
	
}
