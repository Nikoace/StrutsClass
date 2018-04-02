package firstweek;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import com.opensymphony.xwork2.interceptor.PreResultListener;
import javassist.SerialVersionUID;

import java.io.Serializable;

public class MyInterceptor extends AbstractInterceptor  {

    private static final long serialVersionUID = 771652260758459933L;

    private String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String intercept(ActionInvocation actionInvocation) throws Exception {
        actionInvocation.addPreResultListener ( new PreResultListener () {
            @Override
            public void beforeResult(ActionInvocation actionInvocation, String s) {

            }
        } );
        long start = System.currentTimeMillis ();
        String ret = actionInvocation.invoke ();
        long end = System.currentTimeMillis ();
        System.out.println ( this.msg + ret + " 时间:"+ (end-start) + "ms" );
        return  ret;
    }
}
