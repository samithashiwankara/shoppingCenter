package ECommerce.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ECommerce.model.UserDetail;




@Repository("userDAO")
@Transactional

public class UserDAOImple implements UserDAO  {
	
	@Autowired
	SessionFactory sessionFactory;
	

	
	public boolean registerUser(UserDetail user) {
		try {
			sessionFactory.getCurrentSession().save(user);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}

	
	public boolean updateuser(UserDetail user) {
		try {
			
			sessionFactory.getCurrentSession().update(user);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}

	
	public UserDetail getUser(String userName) {
		Session session = sessionFactory.openSession();
		
		UserDetail userDetail=(UserDetail)session.get(UserDetail.class, userName);
		session.close();
		return userDetail;
	}

}
