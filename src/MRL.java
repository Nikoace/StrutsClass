import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.PreResultListener;

public class MRL implements PreResultListener {
    @Override
    public void beforeResult(ActionInvocation actionInvocation, String s) {
        System.out.println ( "调用方法" + actionInvocation.getProxy ().getMethod () );
        System.out.println ( "方法执行结果" + s );
    }
}
