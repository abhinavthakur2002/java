import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class main {
    public static void main(String[] st) throws IOException
    {
        FileInputStream in =null;
        FileOutputStream out=null;
        in=new FileInputStream("abc.txt");
        out=new FileOutputStream("xyz.txt");
        int c;
        while((c=in.read())!=-1){
            System.out.print((char)c);
            out.write(c);
        }
        in.close();
        out.close();
    }
}
