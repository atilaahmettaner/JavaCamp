
public class User {
    private  int id ;
    private String  firstName;
    private String lastName;
    private String password;
    private String eMailAdress;
    public User(){

    }public User(int id, String  firstName ,String lastName, String password , String eMailAdress){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.eMailAdress = eMailAdress;
    }
    public String geteMailAdress() {
        return eMailAdress;
    }

    public void setEMailailAdress(String eMailAdress) {
        this.eMailAdress = eMailAdress;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
