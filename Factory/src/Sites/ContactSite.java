package Sites;

import jdk.nashorn.internal.runtime.linker.JavaAdapterFactory;

import java.util.Random;

/**
 * Created by K4masz on 2017-11-15.
 */
public class ContactSite extends Site {



    public ContactSite() {
        super();
    }

    @Override
    void writeContent(){
        this.contentBuilder.append("Name: ");
        this.contentBuilder.append("DefaultName");
        this.contentBuilder.append("\n");
        this.contentBuilder.append("Tel: ");
        this.contentBuilder.append(new Random().nextInt(120000));
        this.contentBuilder.append("\n");
        this.contentBuilder.append("Address: ");
        this.contentBuilder.append("Default Street Name");
        this.contentBuilder.append("\n");
        this.contentBuilder.append("ZipCode: ");
        this.contentBuilder.append("00-000");
        this.contentBuilder.append("\n");

        this.pageContent = this.contentBuilder.toString();
    }

}
