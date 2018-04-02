package firstweek;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;

public class cal implements ModelDriven<CalParam> {
    private CalParam calParam;
    public cal(){
        this.calParam = new CalParam ();
    }

    public CalParam getCalParam() {
        return calParam;
    }

    public void setCalParam(CalParam calParam) {
        this.calParam = calParam;
    }

    public String cal() {
        switch (this.calParam.getAdd ()) {
            case 1:
                this.calParam.setResult ( this.calParam.getA () + this.calParam.getB () );
                break;
            case 2:
                this.calParam.setResult ( this.calParam.getA () - this.calParam.getB () );
                break;
            case 3:
                this.calParam.setResult ( this.calParam.getA () * this.calParam.getB () );
                break;
            case 4:
                this.calParam.setResult ( this.calParam.getA () / this.calParam.getB () );
                break;
            default:
                return Action.ERROR;

        }
        return Action.SUCCESS;
    }

    @Override
    public CalParam getModel() {
        return null;
    }
}
