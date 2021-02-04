package com.uzel;

import javax.sound.midi.Soundbank;
import java.io.*;
import java.security.Timestamp;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    private static Map<String, Integer> ages = new LinkedHashMap<>();
    static {
        ages.put("Efe", 31);
        ages.put("Emra", 35);
        ages.put("Sevcan", 32);
        ages.put("Nursen", 31);
    }

    public static void main(String[] args) {

    }

    public static void mainBinaryReadWirite(String[] args) {
        try (DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("binary.dat")))) {
            for(String s : ages.keySet()) {
                dataOutputStream.writeUTF(s);
                dataOutputStream.writeInt(ages.get(s));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(new FileInputStream("binary.dat")))) {
            while (dataInputStream.available()>0){
                System.out.println(dataInputStream.readUTF());
                System.out.println(dataInputStream.readInt());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public static void mainBufferedWriter(String[] args) {

        //Demonstrates that buffered writes are about 50% faster in this case
        long startTime = System.currentTimeMillis();
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("bigfile.txt") ) ) {
            for(int i = 0; i<5E7; i++)
                bufferedWriter.write(i + "\n");
        } catch (IOException e) {

        }
        long endTime = System.currentTimeMillis();
        System.out.println("That took " + (endTime - startTime) + " milliseconds");

        startTime = System.currentTimeMillis();
        try(FileWriter fileWriter = new FileWriter("bigfile.txt")) {
            for(int i = 0; i<5E7; i++)
                fileWriter.write(i + "\n");
        } catch (IOException e) {

        }
        endTime = System.currentTimeMillis();

        System.out.println("That took " + (endTime - startTime) + " milliseconds");

    }

    public static void mainBufferedReader(String[] args) {
        //Buffered reader example - It is more efficient to read chunks from file because seek time is reduced
        try {
            Scanner scanner = new Scanner(new BufferedReader(new FileReader("heights.txt")));
            scanner.useDelimiter(" ");
            while (scanner.hasNextLine()) {
                String name = scanner.next();
                scanner.skip(scanner.delimiter());
                int height = Integer.parseInt(scanner.nextLine());
                System.out.println("Name: " + name + " Height: " + height);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    public static void mainFileReading(String[] args) {
        Scanner scanner = null;
        try {
            FileReader fileReader = new FileReader("ages.txt");
            scanner = new Scanner(fileReader);
            scanner.useDelimiter(" ");
            int age = scanner.nextInt();
            scanner.skip(scanner.delimiter());
            String name = scanner.nextLine();
            System.out.println("Read name " + name + " age " + age + " from file.");
        } catch (FileNotFoundException e) {
            System.out.println("File does not exist");
        } finally {
            if(scanner != null) scanner.close(); //takes care of closable readable object closing
        }
    }

    public static void mainTryWithResources(String[] args) throws IOException {
        Map<String, Integer> ages = new LinkedHashMap<>();
        ages.put("Efe", 31);
        ages.put("Emra", 35);
        ages.put("Sevcan", 32);
        ages.put("Nursen", 31);

        Map<String, Integer> heights = new LinkedHashMap<>();
        heights.put("Efe", 175);
        heights.put("Emra", 180);
        heights.put("Sevcan", 165);
        heights.put("Nursen", 160);

        //try-with-resource usage
        try (FileWriter fileWriter = new FileWriter("ages.txt");
             FileWriter fileWriter1 = new FileWriter("heights.txt")) { //ensures stream is closed whether or not there is an error
            for (String s : ages.keySet()) {
                fileWriter.write(s + " " + ages.get(s) + "\n");
                fileWriter1.write(s + " " + heights.get(s) + "\n");
                // throw new IOException("test exception thrown while testing");
            }
        }
    }


    public static void throwing_main(String[] args) throws IOException {
        Map<String, Integer> ages = new LinkedHashMap<>();
        ages.put("Efe", 31);
        ages.put("Emra", 35);
        ages.put("Sevcan", 32);
        ages.put("Nursen", 31);

        FileWriter fileWriter = new FileWriter("my_file.txt"); //stream is opened
        for (String s : ages.keySet()) {
            fileWriter.write(s + " " + ages.get(s) + "\n");
            // throw new IOException("test exception thrown while testing");
        }
        fileWriter.close(); //otherwise file will remain locked and other processes will not have access
    }

    public static void old_main(String[] args) {
        Map<String, Integer> ages = new LinkedHashMap<>();
        ages.put("Efe", 31);
        ages.put("Emra", 35);
        ages.put("Sevcan", 32);
        ages.put("Nursen", 31);

        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("my_file.txt"); //stream is opened
            for (String s : ages.keySet()) {
                fileWriter.write(s + " " + ages.get(s) + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileWriter.close(); //otherwise file will remain locked and other processes will not have access
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}

