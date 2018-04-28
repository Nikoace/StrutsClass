package updown;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class downloadAction extends ActionSupport implements Action {
    private static final long serialVersionUID = 1L;
    private String filename;
    private InputStream inputStream;
    private String filePath;

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public InputStream getInputStream() {
        return inputStream;
    }

    public void setInputStream(InputStream inputStream) {
        this.inputStream = inputStream;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public String execute() throws Exception {
        String fn = filePath+filename;
        if (!new File ( fn ).exists ()){
            return Action.ERROR;
        }
        this.inputStream = new FileInputStream ( new File ( fn ) );
        return Action.SUCCESS;
    }
}
