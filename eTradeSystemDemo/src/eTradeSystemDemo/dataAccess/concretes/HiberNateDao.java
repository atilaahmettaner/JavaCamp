package eTradeSystemDemo.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import eTradeSystemDemo.dataAccess.abstracts.UserDao;
import eTradeSystemDemo.entities.concretes.User;

public class HiberNateDao implements UserDao {
	ArrayList<User> users = new ArrayList<User>( );

	public HiberNateDao() {

		User user1 = new User(1, "Umut", "Bozkaya", "bozkayaumut78@hotmail.com", "password123");
		User users2 = new User(1, "ahmet", "atila", "ahmetatila@outlook.com", "password123");
	}

	@Override
	public void add(User user) {
		users.add(user);
		System.out.println(user.getFirstName( ) + " eklendi");

	}

	@Override
	public void delete(int userId) {

	}

	public void delete(User user) {
		users.remove(user);
		System.out.println("kullanici silimid: "+user.getFirstName());
	}

	@Override
	public void update(User user) {

		System.out.println(user.getFirstName( ) + "güncellendi");

	}

	@Override
	public User get(String mail) {

		return this.users.stream( ).filter((user) -> user.getEmail( ) == mail).findFirst( ).orElse(null);

	}


	@Override
	public List<User> getAll() {

		return users;
	}

	public boolean emailExist(User user) {
		for (User a : users) {
			if ( a.getEmail( ) == user.getEmail( ) ) {
				return false;
			}
		}

		return false;
	}
}