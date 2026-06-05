package com.college.oop.streams;

import java.io.*;
import java.util.Scanner;
import java.util.zip.GZIPInputStream;

public class Main {
    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("my_file.dat")){
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            PrintWriter pw = new PrintWriter(bos);

            pw.print("Hello world!\n");
            pw.print(23);
            pw.printf("Hello here!%n");
            pw.println("PRINTLN");

            bos.write(new byte[]{34, 65, 35, 111});

            pw.close();
            bos.close();
        } catch (FileNotFoundException ex) {

        } catch (IOException ex) {

        }

        try (FileInputStream fr = new FileInputStream("my_file.dat")) {
            InputStreamReader isr = new InputStreamReader(fr);
            BufferedReader bfr = new BufferedReader(isr);

            String s = bfr.readLine();

            bfr.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {

        }
    }
}
