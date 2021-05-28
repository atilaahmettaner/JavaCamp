package eTradeSystemDemo.business.abstracts;


import java.sql.ClientInfoStatus;
import java.util.List;

import eTradeSystemDemo.entities.concretes.*;
   public interface UserService{
	   void add(User user);
	   void  update(User user);
	   void delete(int userId);
	   User get(String email);
	   List<User> getAll();




   }
         

