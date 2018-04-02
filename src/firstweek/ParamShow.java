package firstweek;

import com.opensymphony.xwork2.Action;

public class ParamShow implements Action{
    private String username;
    private String passwd;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }
    public String execute() throws Exception {
        if (this.username==null||this.username.equals ( "" )||this.username.trim ().equals ( "" )||this.passwd==null||this.passwd.equals ( "" )||this.passwd.trim ().equals ( "" )){
            return Action.ERROR;
        }
        return Action.SUCCESS;
    }
}
