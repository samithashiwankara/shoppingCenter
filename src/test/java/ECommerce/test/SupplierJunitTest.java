package ECommerce.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import ECommerce.DAO.SupplierDAO;
import ECommerce.model.Supplier;

public class SupplierJunitTest {

	static SupplierDAO supplierDAO;
		
		@BeforeClass 
		
		public static void executeFirst()
		{
	        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
			
			context.scan("ECommerce");
			context.refresh();
			
			supplierDAO=(SupplierDAO)context.getBean("supplierDAO");
			
		}

	@Test
	
	public void addSupplierTest()
	{
	  Supplier supplier= new Supplier();
	  supplier.setSupplierId(5);
	  supplier.setSupplierAddr("Kuliyapitiya,Kuliyapitiya");
	  supplier.setSupplierName("ABC");
	  
	  assertTrue("Problem in adding Supplier",supplierDAO.addSupplier(supplier));
	  
	}

}
