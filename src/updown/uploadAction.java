package updown;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class uploadAction extends ActionSupport implements Action{
    private static final long serialVersionUID = 1L;
    private File upload;
    private String uploadFilename;
    private String uploadContenttype;
    private String filename;
    private String info;
    private String savePath;

    public File getUpload() {
        return upload;
    }

    public void setUpload(File upload) {
        this.upload = upload;
    }

    public String getUploadFilename() {
        return uploadFilename;
    }

    public void setUploadFilename(String uploadFilename) {
        this.uploadFilename = uploadFilename;
    }

    public String getUploadContenttype() {
        return uploadContenttype;
    }

    public void setUploadContenttype(String uploadContenttype) {
        this.uploadContenttype = uploadContenttype;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getSavePath() {
        return savePath;
    }

    public void setSavePath(String savePath) {
        this.savePath = savePath;
    }

    @Override
    public String execute() throws Exception {
        String fn = "";
        if (filename==null||filename.equals ( "" )||filename.trim ().equals ( "" )){
            fn = savePath + uploadFilename;
        }else {
            fn = savePath + filename;
        }

        if (new File ( fn ).exists ()){
            info = "File already exist,rename";
        }else {
            FileInputStream inputStream = new FileInputStream ( upload );
            FileOutputStream outputStream = new FileOutputStream ( new File ( fn ) );
            byte[] buffer = new byte[1024];
            int count = 0;
            while ((count = inputStream.read (buffer))>0){
                outputStream.write ( buffer,0,count );
            }
            inputStream.close ();
            outputStream.close ();
            info = "upload finish";
        }
        return Action.SUCCESS;
    }
}
