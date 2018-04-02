package Five;

import com.opensymphony.xwork2.Action;

import java.util.Date;

public class MyBirthday implements Action {
    private Date mDate;

    public String execute() throws Exception {
        return Action.SUCCESS;
    }

    public Date getmDate() {
        return mDate;
    }

    public void setmDate(Date mDate) {
        this.mDate = mDate;
    }
}
