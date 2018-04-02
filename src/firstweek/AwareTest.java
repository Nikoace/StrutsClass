package firstweek;

import com.opensymphony.xwork2.Action;
import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.ServletRequestAware;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;

public class AwareTest implements ApplicationAware,ServletRequestAware{

    private String username;
    private String pass;
    private int allnum;
    private int num;
    private HttpServletRequest request;
    private Map <String, Object> application;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public int getAllnum() {
        return allnum;
    }

    public void setAllnum(int allnum) {
        this.allnum = allnum;
    }

    public String num(){
        HttpSession session = this.request.getSession ();
        Integer count = (Integer) this.application.get("count");
        count = count == null?1:count+1;
        Integer count2 = (Integer) session.getAttribute ( username );
        count2 = count2 == null?1:count2+1;
        session.setAttribute ( username,count2 );
        application.put("count",count);
        allnum = count2.intValue ();
        num = count.intValue ();
        return Action.SUCCESS;
    }
    public void setApplication(Map<String, Object> map) {
        this.application = map;
    }

    public void setServletRequest(HttpServletRequest httpServletRequest) {
        this.request = httpServletRequest;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
