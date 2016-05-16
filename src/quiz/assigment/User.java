package quiz.assigment;


public class User {
    
    private String UserName;
    private String Password;

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
    
    public User (String Username , String Password)
    {
        this.UserName = Username;
        this.Password = Password;
    }
}
