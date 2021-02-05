package com.uzel;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Path path = FileSystems.getDefault().getPath("WorkingDirectoryFile.txt");
        printFile(path);
        System.out.println();

        path = FileSystems.getDefault().getPath("files","SubdirectoryFile.txt");
        printFile(path);
        System.out.println();

        path = FileSystems.getDefault().getPath("..","OutThere.txt");
        printFile(path);
        System.out.println();

        path = Paths.get("/Users/eu/java-masterclass/OutThere.txt");
        printFile(path);
        System.out.println("File size is: " + Files.size(path));
        System.out.println("Last modified: " + Files.getLastModifiedTime(path));
        System.out.println("Is regular: " + Files.isRegularFile(path));
        System.out.println();

        Path path3 = FileSystems.getDefault().getPath("thisfilesoesnotexist.txt");
        System.out.println(path3.toAbsolutePath());

        Path path4 = Paths.get("whatever.txt");
        System.out.println(path4.toAbsolutePath());
        System.out.println("Exists: " + Files.exists(path4));

        Iterable<FileStore> stores = FileSystems.getDefault().getFileStores();
        for(FileStore store : stores) {
            System.out.println(store.name());
            System.out.println(store + "\n");
        }

        Iterable<Path> paths = FileSystems.getDefault().getRootDirectories();
        for(Path p : paths) {
            System.out.println(p);
        }

    }

    public static void printFile(Path path) {
        try(BufferedReader fileReader = Files.newBufferedReader(path)) {
            String line;
            while ((line = fileReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
