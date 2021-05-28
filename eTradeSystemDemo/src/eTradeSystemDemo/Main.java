package eTradeSystemDemo;

import eTradeSystemDemo.business.abstracts.UserService;
import eTradeSystemDemo.business.concretes.AuthManager;
import eTradeSystemDemo.business.concretes.UserManager;
import eTradeSystemDemo.core.adapters.GoogleAuthManagerAdapter;
import eTradeSystemDemo.core.adapters.GoogleMailManagerAdapter;
import eTradeSystemDemo.core.adapters.YandexMailManagerAdapter;
import eTradeSystemDemo.dataAccess.concretes.HiberNateDao;
import eTradeSystemDemo.entities.concretes.User;
import eTradeSystemDemo.googleAuth.GoogleAuthManager;
import eTradeSystemDemo.googleMailManager.GoogleMailManager;


public class Main {
	public static void main(String[] args) {

		User ahmet = new User(5, "ahmet", "atila", "atilaahet@gamil.com", "ahmet123");
		HiberNateDao hiberNateDao = new HiberNateDao();

		GoogleMailManagerAdapter googleMailManagerAdapter=new GoogleMailManagerAdapter();
		YandexMailManagerAdapter yandexMailManagerAdapter = new YandexMailManagerAdapter();
		UserManager userManager =new UserManager(hiberNateDao,yandexMailManagerAdapter);

		AuthManager authManager =new AuthManager(new UserManager(hiberNateDao,googleMailManagerAdapter));
		authManager.signup(ahmet);
		userManager.add(ahmet);

		userManager.getAll();


	}
}
