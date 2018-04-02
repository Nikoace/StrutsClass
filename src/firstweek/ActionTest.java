package firstweek;

import com.opensymphony.xwork2.Action;

import java.util.Random;

public class ActionTest implements Action{
    private Random random;
    public ActionTest(){
        this.random = new Random (  );
    }
    public String execute() throws Exception{
        if (random.nextInt ( 100 )>20){
            return SUCCESS;
        }
        else {
            return ERROR;
        }
    }
}
