package bai10;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class video59 {
    public static void main(String[] args) throws IOException {
        FileInputStream in = null;
        FileOutputStream out =  null;
        try {
            in = new FileInputStream("./src/bai10/input.txt");
            out = new FileOutputStream("./src/bai10/outagain.txt");
            int c;

            while ((c = in.read()) != -1) {
                out.write(c);
            }
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
}
    }
}
