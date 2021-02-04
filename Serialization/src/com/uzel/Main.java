package com.uzel;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        MySerializableClass objToWrite = new MySerializableClass();
	    try (ObjectOutputStream s = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("object_data.dat")))) {
            s.writeObject(objToWrite);
	    } catch (IOException e) {
            e.printStackTrace();
        }

	    MySerializableClass readObject;
	    try(ObjectInputStream s = new ObjectInputStream(new BufferedInputStream(new FileInputStream("object_data.dat")))) {
            readObject = (MySerializableClass) s.readObject();
            System.out.println(readObject.contents());

	    } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }



    }
}
