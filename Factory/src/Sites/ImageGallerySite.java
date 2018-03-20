package Sites;

import java.util.Random;

/**
 * Created by K4masz on 2017-11-15.
 */
public class ImageGallerySite extends Site {


    public ImageGallerySite() {
        super();
    }

    @Override
    void writeContent(){
        int max = new Random().nextInt(5);
        for(int i = 1; i < max; i++) {
            this.contentBuilder.append("<img src=\".\\src\\Sites\\Images\\" + i + ".jpg\">");
            this.contentBuilder.append("<br>");
        }
        this.pageContent = this.contentBuilder.toString();
    }
}
