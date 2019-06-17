package tests;

import item.Item;
import item.ItemDAO;
import item.ItemWrapper;
import org.w3c.dom.Node;

import javax.xml.bind.*;
import java.io.File;
import java.util.ArrayList;

public class TestRunner {
    public static void main(String[] args) {
        TestRunner testRunner = new TestRunner();
        System.out.println("**Checking item creation");
        System.out.println("**Test result is " + testRunner.testItemObjectCreation());

        System.out.println("**Checking ItemDAO getter");
        ItemDAO itemDAO = ItemDAO.getItemDAO();
        if (itemDAO != null) {
            System.out.println("**ItemDAO getted");

        }

        System.out.println("**Saving to xml result is " + testRunner.savingItemToXml());

        System.out.println("**Saving to xml result of wrapper is " + testRunner.savingItemWrapperToXml());
        System.out.println("Reading form xml is " + testRunner.readItemsFromFile());


    }

    public boolean readItemsFromFile() {

        ItemWrapper itemWrapper = null;

        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(ItemWrapper.class, Item.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            itemWrapper = (ItemWrapper) unmarshaller.unmarshal(new File("itemWrapper.xml"));
        } catch (JAXBException e) {
            e.printStackTrace();
        }

        System.out.println("Unmarshall finished");
        System.out.println("itemWrapper is " + itemWrapper);
        return true;
    }

    public boolean savingItemWrapperToXml() {

        ArrayList<Item> itemArrayList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            itemArrayList.add(new Item(i, "Lada", 100500));
        }

        ItemWrapper itemWrapper = new ItemWrapper(itemArrayList);

        try {
            File file = new File("itemWrapper.xml");

            JAXBContext jaxbContext = JAXBContext.newInstance(ItemWrapper.class, Item.class);
            Marshaller marshaller = jaxbContext.createMarshaller();
            marshaller.setProperty(marshaller.JAXB_FORMATTED_OUTPUT, true);
            Binder<Node> binder = jaxbContext.createBinder();

            if (file.exists() == true) {
                binder.updateXML(file);
            } else {
                marshaller.marshal(itemWrapper, file);
            }



        } catch (JAXBException e) {
            e.printStackTrace();
        }


        return false;

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
