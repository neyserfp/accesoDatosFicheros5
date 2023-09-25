package com.neyser;

import java.io.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws IOException {

        File file1 = new File("carpetaDatos1/datos1.txt");

        /*
        File file2 = new File("carpetaDatos1");
        File file3 = new File("carpetaDatos1/datos1.txt");
        file2.mkdir();
        file3.createNewFile();
         */

        if (file1.delete())
        {
            System.out.println("El fichero ha sido eliminado");
        } else{
            System.out.println("El fichero NO ha sido eliminado");
        }



    }
}