package eTradeSystemDemo.business.concretes;


import eTradeSystemDemo.business.abstracts.AuthService;
import eTradeSystemDemo.business.abstracts.UserService;

import eTradeSystemDemo.entities.concretes.User;

import java.util.List;

public class AuthManager implements AuthService {
	UserService userService;

	public AuthManager(UserManager userManager) {
		super();
		this.userService=userService;

	}
	public void signup(User user) {
		if(userValidate(user)&&PasswordValidation(user.getPassword())){

				userService.add(user);

					System.out.println("kulnici eklendi ");
		}

	}
	public void login(User user ) {
		if(PasswordValidation(user.getPassword())) {

			System.out.println("Basariyla giris yapildi ");

		}else
		System.out.println("lutfen kontrol ederek tekrar giriniz ");

	}

	public boolean logout(String email) {
		System.out.println("başarıyla çıkış yapıldı ");
		return false;
	}

	@Override
	public void getAll(int id) {

	}


	public List<User> getAll() {
		return userService.getAll();
	}
	public boolean userValidate(User user ) {
		if(user.getEmail().isEmpty()&&user.getFirstName().isEmpty()&&user.getPassword().isEmpty()
				&&user.getLastName().isEmpty()) {
			return true;
		}
		return false;

	}
	public boolean PasswordValidation(String password){
		return password.length( ) >= 6;

	}

}
