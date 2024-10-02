package ServicesImplementation;
import Models.*;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

import Services.UserService;

public class UserServiceImplementation implements UserService{
	Map<String,User> users;

	public UserServiceImplementation()
	{
		this.users=new ConcurrentHashMap<>();
	}
	private static UserServiceImplementation instance=null;
	public static UserServiceImplementation getInstance()
	{
		if(instance==null)
			instance=new UserServiceImplementation();
		return instance;
	}
	@Override
	public void createUser(User user) {
		users.put(user.getId(), user);
	}
	@Override
	public User getUser(String id) {
		return users.get(id);
	}
	@Override
	public void deleteUser(String id) {
		users.remove(id);
		
	}
	
	
     
}
