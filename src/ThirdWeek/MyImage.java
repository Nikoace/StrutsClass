package ThirdWeek;

import com.opensymphony.xwork2.Action;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;

public class MyImage implements Action {
    private InputStream mystream;

    public String execute() throws Exception {
        BufferedImage image = CodeImage.drawImage ( CodeImage.randomword () );
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream (  );
        ImageIO.write ( image,"JPEG",outputStream );
        mystream = new ByteArrayInputStream ( outputStream.toByteArray () );
        return Action.SUCCESS;
    }

    public InputStream getMystream() {
        return mystream;
    }

    public void setMystream(InputStream mystream) {
        this.mystream = mystream;
    }
}
