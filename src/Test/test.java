package Test;

import Util.FileSafeCode;
import Util.Run;
import Util.getTempPass;

import java.io.File;

public class test {
    public static void main(String[] args) {
        try {

           String sha1= FileSafeCode.getSha1(new File("C:\\Users\\Administrator\\Desktop\\1.mp4"));
            System.out.println(sha1);
        }catch (Exception e){

        }

    }
}
