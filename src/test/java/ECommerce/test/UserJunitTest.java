package ECommerce.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import ECommerce.DAO.UserDAO;
import ECommerce.model.UserDetail;

public class UserJunitTest {

	static UserDAO userDAO;
	
	@BeforeClass 
	
	public static void executeFirst()
	{
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		
		context.scan("ECommerce");
		context.refresh();
		
		userDAO=(UserDAO)context.getBean("userDAO");
		
	}
	
	
	
	@Test
	public void registerUserTest()
	{
		UserDetail user = new UserDetail();
		user.setUserName("Aiit");
		user.setPassword("pass123");
		user.setEnabled(true);
		user.setRole("Role_User");
		user.setCustomerName("Nimal");
		user.setCustomerAddr("Kurunagala");
		
		
		 assertTrue("Problem in Reigister user",userDAO.registerUser(user));
		
	}

}
