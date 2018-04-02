package Five;

import com.opensymphony.xwork2.Action;

public class MyScore implements Action {
    private int[] score;

    public int[] getScore() {
        return score;
    }

    public void setScore(int[] score) {
        this.score = score;
    }

    public MyScore(){
        this.score = new int[4];
    }

    public String execute() throws Exception {
        return Action.SUCCESS;
    }
}
