package unit_4;
import java.io.*;
public class SerializePerson {

    public static void main(String[] args) {

        Person p = new Person("John Doe", 30);

        try {
            FileOutputStream fos =
                new FileOutputStream("person.ser");

            ObjectOutputStream oos =
                new ObjectOutputStream(fos);

            oos.writeObject(p);

            oos.close();
            fos.close();

            System.out.println("Person object saved!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}