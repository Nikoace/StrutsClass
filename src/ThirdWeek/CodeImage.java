package ThirdWeek;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Random;

public class CodeImage {
    private final static String M_STRING = "0123456789QWERTYUIOPASDFGHJKLZXCVBNM";
    public static String randomword(){
        Random random = new Random (  );
        StringBuilder builder = new StringBuilder (  );
        for(int i = 0; i < 4; i++){
            int index = random.nextInt ( M_STRING.length () );
            builder.append ( M_STRING.charAt ( index ) );
        }
        return builder.toString ();
    }
    public static BufferedImage drawImage(String word){
        BufferedImage image  = new BufferedImage ( 200,50,BufferedImage.TYPE_INT_RGB );
        Graphics graphics = image.getGraphics ();
        graphics.setColor ( new Color ( 255,255,255 ) );
        graphics.fillRect ( 0,0,200,50 );
        graphics.setColor ( Color.BLACK );
        graphics.drawString ( word,70,25 );
        return image;

    }

}
