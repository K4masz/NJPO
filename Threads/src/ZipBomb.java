import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

public class ZipBomb implements Runnable {

    private Random rand;
    private String name;
    private StringBuilder sb;
    private int num;

    public ZipBomb(int num) {
        this.num = num;
        this.rand = new Random();
        System.out.println("Thread no: " + num);
    }


    public String generateContent(int sizeInKB) {
        //sizeInKB /= 2;
        sizeInKB *= 1024;
        this.sb = new StringBuilder(sizeInKB);
        for (int i = 0; i < sizeInKB; i++) {
            ;
            sb.append('a');
        }
        return sb.toString();
    }

    @Override
    public void run() {

        File file = new File("1MB");
        String content = generateContent(1000);
        byte[] data = content.getBytes();
        try {
            FileOutputStream fos = new FileOutputStream(file);
            fos.write(data);
            fos.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException f) {
            System.out.println(f);
        }
    }


}
