package com.company;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        FileWriter writer = new FileWriter("file.txt");
        for (int i = 65, j = 97; i < 91; i++) {
            writer.write(i);
            writer.write(' ');
            writer.write(j);
            j++;
            writer.write('\n');
        }
        for (int i = 48; i < 58; i++) {
            writer.write(i);
            writer.write('\n');
        }
        writer.close();


        FileReader fileReader = new FileReader("file.txt");
        Scanner scanner = new Scanner(fileReader);
        int i = 1;
        while (scanner.hasNextLine()){
            System.out.println(i + ": " + scanner.nextLine());
            i++;
        }
        fileReader.close();
    }
}
