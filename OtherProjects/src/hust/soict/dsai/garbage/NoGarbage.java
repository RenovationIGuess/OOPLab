package hust.soict.dsai.garbage;

import java.io.FileInputStream;
import java.io.IOException;

public class NoGarbage {
    public static void main(String[] args) throws IOException {
        String filename = "E:/OOP/OtherProjects/src/hust/soict/dsai/garbage/test.txt";
        FileInputStream input = new FileInputStream(filename);
        long startTime, endTime;

        startTime = System.currentTimeMillis();
        StringBuffer outputString = new StringBuffer();
        int i = 0;
        while ((i = input.read()) != -1) {
            outputString.append((char)i);
        }
        endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
        System.out.println(outputString.toString());
    }
}
