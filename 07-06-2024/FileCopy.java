import java.io.*;
import java.util.*;

public class FileCopy {

    public static void main(String[] args) throws Exception {
        File x = new File("a.txt");
        File y = new File("b.txt");
        FileInputStream in = new FileInputStream(x);
        FileOutputStream out = new FileOutputStream(y);

        try {

            int n;
            while ((n = in.read()) != -1) {
                out.write(n);
            }
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
        System.out.println("File Copied");

    }
}
