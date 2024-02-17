package ECommerce.DAO;

import ECommerce.model.UserDetail;

public interface UserDAO {

	public boolean registerUser(UserDetail user);
	public boolean updateuser(UserDetail user);
	
	public UserDetail getUser(String userName);
	
	
	
	
}
