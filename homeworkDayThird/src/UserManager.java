public class UserManager {
    public void add(User user){

        System.out.println(user.getId()+"numaralı"+user.getFirstName()+"isimli kullanıcı eklendi." );

    }public void delete(User user){

        System.out.println(user.getId()+"numaralı"+user.getFirstName()+"isimli kullanıcı silindi." );

    }
    public  void multipileadd(User[] users){

        for(User user :users){
            add(user);
        }

    }
}
