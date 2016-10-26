/**
 * PG2NBF.java
 *
 * loads and writes files and creates and calls LRU
 *
 * @author Nathan Faucett
 * @version Oct 25, 2016
 */


import java.io.IOException;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.nio.charset.Charset;

import java.util.List;
import java.util.Arrays;


public class PG2NBF {
    private static String newline = System.getProperty("line.separator");


    static String readFile(String path) {
        try {
            byte[] encoded = Files.readAllBytes(Paths.get(path));
            return new String(encoded, Charset.forName("UTF-8"));
        } catch(IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    static boolean writeFile(String path, String content) {
        Path file = Paths.get(path);
        List<String> lines = Arrays.asList(content.split(newline));

        try {
            Files.write(file, lines, Charset.forName("UTF-8"));
            return true;
        } catch(IOException e) {
           e.printStackTrace();
           return false;
       }
    }

    public static String runLRUForFrames(String[] frameStrings, int frames) {
        String out = "LRU algorithm with " + frames + " frames: " + newline + newline;
        LRU lru = new LRU(frames);

        for (int i = 0; i < frameStrings.length; i++) {
            int page = Integer.parseInt(frameStrings[i]);
            lru.addPage(page);
            out += lru + newline;
        }

        out += newline + "Total number of page faults is " + lru.getPageFaults();

        return out;
    }

    public static void main(String[] args) {
        String pageRef = readFile("pageRefString.txt");

        if (pageRef != null) {
            String[] splited = pageRef.split("\\s+");

            String out3Frames = runLRUForFrames(splited, 3);
            String out4Frames = runLRUForFrames(splited, 4);

            writeFile("pg2out.txt", out3Frames + newline + newline + out4Frames);

            System.out.println(out3Frames);
            System.out.println(out4Frames);
        }
    }
}
