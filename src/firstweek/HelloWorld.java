package firstweek;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;

import java.util.Map;

public class HelloWorld {
    private String message;
    private String username;
    private String userpass;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserpass() {
        return userpass;
    }

    public void setUserpass(String userpass) {
        this.userpass = userpass;
    }

    public String sayhi(){
        this.message = "hello world struts2";
        return "OK";
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String sayGood(){
        this.message = "hello!";
        return "nice";
    }
    public String login(){
        if ("Tom".equals ( username ) && "123".equals ( userpass ) ){
            Map<String,Object> session = ActionContext.getContext ().getSession ();
            session.put ( "username", username );
            return this.sayhi ();
        }
        return Action.LOGIN;
    }

}
