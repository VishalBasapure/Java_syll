package unit_4;

import java.io.*;

public class DeserializePerson {
    public static void main(String[] args) {

        try {
            FileInputStream fis =
                new FileInputStream("person.ser");

            ObjectInputStream ois =
                new ObjectInputStream(fis);

            Person p = (Person) ois.readObject();

            System.out.println("Person restored: " + p);

            ois.close();
            fis.close();

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}