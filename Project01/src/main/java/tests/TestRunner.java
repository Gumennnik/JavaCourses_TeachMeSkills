package tests;

import item.Item;
import item.ItemDAO;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;

public class TestRunner {
    public static void main(String[] args) {
        TestRunner testRunner = new TestRunner();
        System.out.println("Checking item creation");
        System.out.println("Test result is " + testRunner.testItemObjectCreation());

        System.out.println("Checking ItemDAO getter");
        if (ItemDAO.getItemDAO() != null) {
            System.out.println("ItemDAO getted");

        }

        System.out.println("Saving to xml result is " + testRunner.savingItemToXml());



    }

    public boolean savingItemToXml() {
        Item item = new Item(10, "Lada", 200);


        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Item.class);
            Marshaller marshaller = jaxbContext.createMarshaller();
            marshaller.setProperty(marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.marshal(item, new File("itemTest.xml"));



        } catch (JAXBException e) {
            e.printStackTrace();
        }


        return false;
    }

    public boolean testItemObjectCreation(){
        Item item = new Item(10, "Lada", 200);
        //test passing
        boolean testResult = false;


        if (item.getId() == 10 && item.getItemName().equals("Lada") && item.getItemPrice() == 200) {
            testResult = true;
        }


        return testResult;
    }
}
