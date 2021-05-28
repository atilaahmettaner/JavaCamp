package eTradeSystemDemo.business.concretes;


import eTradeSystemDemo.business.abstracts.UserService;
import eTradeSystemDemo.core.abstracts.EmailService;
import eTradeSystemDemo.dataAccess.abstracts.UserDao;
import eTradeSystemDemo.entities.concretes.User;

import java.util.List;

public class UserManager implements UserService {
	UserDao userDao;
	EmailService emailService;
	public UserManager(UserDao userDao,EmailService emailService) {
		this.userDao = userDao;
		this.emailService=emailService;
	}
	@Override
	public void add(User user) {
		if (userValidate(user)  ) {
			userDao.add(user);
			System.out.println("kullanıcı eklendi");


		}
		else
			System.out.println( "Kullanıcı eklenemedi. " );
	}
	@Override
	public void update(User user) {
		userDao.update(user);
	}

	@Override
	public void delete(int userId) {
		userDao.delete(userId);
	}

	@Override
	public User get(String email) {
		return userDao.get(email);
	}

	@Override
	public List<User> getAll() {
		return null;
	}

	boolean userValidate(User user) {
		if ( user.getPassword( ).length( ) >= 2 && user
				.getFirstName( ).length( ) >= 2 ) {
			System.out.println( "doğrulandı " );
		return true	;
		}
		System.out.println("ad ve soyad kısmını en az iki karakter olacak şekilde doldurunuz " );
		return false;
	}
}