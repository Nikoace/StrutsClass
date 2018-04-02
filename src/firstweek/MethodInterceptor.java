package firstweek;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;
import com.opensymphony.xwork2.interceptor.PreResultListener;

public class MethodInterceptor extends MethodFilterInterceptor {
    private static final long serialVersionUID = 1L;
    private String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    protected String doIntercept(ActionInvocation actionInvocation) throws Exception {
        actionInvocation.addPreResultListener ( (PreResultListener) new MyInterceptor () );
        long start = System.currentTimeMillis ();
        String ret = actionInvocation.invoke ();
        long end = System.currentTimeMillis ();
        System.out.println ( this.msg + ret + " 时间:"+ (end-start) + "ms" );
        return  ret;

    }
}
