package com.sujata.byteio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriteDemoClass {

    public static void main(String[] args) {
        try(FileOutputStream fileOutputStream=new FileOutputStream("DemoByte");) {


            byte[] arr={'I','T','R','O','N','\n','T','R','A','I','N','I','N','G'};

            fileOutputStream.write(arr);
            System.out.println("File created!");

        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
