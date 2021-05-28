package eTradeSystemDemo.core.abstracts;

import eTradeSystemDemo.entities.concretes.User;

public interface UserValidateService {
    void register(String email);

    void login(User user, String email,String password);

}
