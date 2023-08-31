package com.sujata.chario;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriteDemoClass {
    public static void main(String[] args) {
        try (FileWriter fileWriter=new FileWriter("DemoChar");){


            String str="Itron Training !!!";
            fileWriter.write(str);
            System.out.println("File Created");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
