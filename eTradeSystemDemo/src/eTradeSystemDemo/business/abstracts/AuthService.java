package eTradeSystemDemo.business.abstracts;

import eTradeSystemDemo.entities.concretes.User;

import java.util.List;

public interface AuthService {
    void signup(User user );
    void login (User user );
    boolean logout(String mail);
    void getAll (int id);
    List<User> getAll();
}
