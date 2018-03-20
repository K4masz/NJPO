package Sites;

import java.io.*;

/**
 * Created by K4masz on 2017-11-15.
 */
public class Site {

    protected String pageTitle;
    protected String pageContent;
    protected StringBuilder htmlBuilder;
    protected StringBuilder contentBuilder;

    public Site(){
        this.pageTitle = "Default";
        this.contentBuilder = new StringBuilder();
        this.htmlBuilder = new StringBuilder();
        generate();
    }

    void generate(){
        this.writeContent();
        this.writeDocument();
        this.writeToFile(htmlBuilder.toString() , "index.html" );
    }

    void writeToFile(String fileContent, String filename){
        File temp = new File(filename);

        OutputStream outputStream = null;
        try {
            outputStream = new FileOutputStream(temp.getAbsoluteFile());

        Writer writer = new OutputStreamWriter(outputStream);
        writer.write(fileContent);
        writer.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException f){
            System.out.println(f);
        }
    }

    void writeDocument(){
        htmlBuilder.append("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "<title>" +
                this.pageTitle +
                "</title>\n" +
                "</head>\n" +
                "<body>\n" +
                this.pageContent +
                "</body>\n" +
                "</html>");
    }

    void writeContent(){


        this.pageContent = this.contentBuilder.toString();
    }
}
