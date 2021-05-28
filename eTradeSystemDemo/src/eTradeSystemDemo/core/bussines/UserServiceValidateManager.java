package eTradeSystemDemo.core.bussines;

import eTradeSystemDemo.core.abstracts.UserValidateService;
import eTradeSystemDemo.entities.concretes.User;

public class UserServiceValidateManager implements UserValidateService {
    @Override
    public void register(String email) {


        }


    @Override
    public void login(User user, String email, String password) {
        if ( (user.getPassword().equals(password)&& user.getEmail().equals(email))) {
            System.out.println("başarıyla giriş yapıldı ");
        }
            else
            System.out.println("Üyelik bilgilerinizi kontrol ederek tekrar deneyiniz " );




    }
}