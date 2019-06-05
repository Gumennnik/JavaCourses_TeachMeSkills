package Classwork11.main.java;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.*;

public class Classwork11 {
    public static void main(String[] args) {
        System.out.println("It works");

        Car car = new Car("Audi", 100, 30000);

        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("CarSaver.txt"))) {

            objectOutputStream.writeObject(car);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }



        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("CarSaver.txt"))) {

            System.out.println("found car : " + objectInputStream.readObject());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        Car car = new Car("Audi2", 1030, 300030);


//        Student student = new Student(3, "Petya", 277);
        Student student = new Student();

        try {
            JAXBContext context = JAXBContext.newInstance(Student.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            student = (Student) unmarshaller.unmarshal(new File("studentFile.xml"));


            Marshaller marshaller = context.createMarshaller();

            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            marshaller.marshal(student,new File("studentFile.xml"));



        } catch (JAXBException e) {
            e.printStackTrace();
        }
        System.out.println(student);

    }
}

