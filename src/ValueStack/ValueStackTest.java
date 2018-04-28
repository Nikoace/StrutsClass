package ValueStack;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;

public class ValueStackTest implements Action{
    public String getWord(){
        return "root Fake";
    }
    public void setWord(){
        System.out.println ( "nothing" );
    }

    @Override
    public String execute() throws Exception {
        String word2 = "data 2 save in contextMap";
        ActionContext context = ActionContext.getContext ();
        context.put ( "wordnn",word2 );
        return Action.SUCCESS;
    }
}
