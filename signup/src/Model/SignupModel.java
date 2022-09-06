package Model;

public class SignupModel {
    private String userName;
    private String passWord;

    public SignupModel(){
        this.userName = "";
        this.passWord = "";
    }
    public String getUserName(){
        return this.userName;
    }
    public void setUserName(String username){
        this.userName = username;
    }
    public String getPassWord(){
        return this.passWord;
    }
    public void setPassWord(String password){
        this.passWord = password;
    }

    
}
