package eTradeSystemDemo.dataAccess.abstracts;

import java.util.List;

import eTradeSystemDemo.entities.concretes.User;

public interface UserDao {
	void add(User user );
	void delete(int userId );
	void update(User user );
	User get(String  mail);
	List<User> getAll();
	
}
