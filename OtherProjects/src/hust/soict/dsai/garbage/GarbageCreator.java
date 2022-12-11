package hust.soict.dsai.garbage;

import java.io.FileInputStream;
import java.io.IOException;

public class GarbageCreator {
    public static void main(String[] args) throws IOException {
        String filename = "E:/OOP/OtherProjects/src/hust/soict/dsai/garbage/test.txt";
        FileInputStream input = new FileInputStream(filename);
        long startTime, endTime;

        startTime = System.currentTimeMillis();
        String outputString = "";
        int i = 0;
        while ((i = input.read()) != -1) {
            outputString += (char)i;
        }
        endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
        System.out.println(outputString);
    }
}
