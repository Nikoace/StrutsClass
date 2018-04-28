package valibate;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.Validateable;


public class MyValidateAction implements Action,Validateable {
    private static final long serialVersionUID = 1L;

    private String username;
    private String password;

    public void validate() {
        if (this.username == null || this.username.equals ( "" )||this.username.trim ().equals ( "" )){
        }
        if (this.password == null || this.password.equals ( "" )||this.password.trim ().equals ( "" )){
        }
    }
    public String execute(){
        return Action.SUCCESS;
    }
    public String check(){
        return Action.SUCCESS;
    }
    public void validateCheck(){
        if (this.username == null || this.username.equals ( "" )||this.username.trim ().equals ( "" )){
        }
        if (this.password == null || this.password.equals ( "" )||this.password.trim ().equals ( "" )){
        }

    }
}
