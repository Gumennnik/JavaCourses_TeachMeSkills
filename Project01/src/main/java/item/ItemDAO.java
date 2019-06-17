package item;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.ArrayList;
import java.util.List;


//TODO: Saving to xml
//TODO: Loading from xml at program start
public class ItemDAO {
    private ItemWrapper itemWrapper = null;
    private static ItemDAO itemDAO;
    {
        itemDAO = new ItemDAO();

        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(ItemWrapper.class, Item.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            itemWrapper = (ItemWrapper) unmarshaller.unmarshal(new File("itemWrapper.xml"));
        } catch (JAXBException e) {
            System.out.println("Unmarshll failled");
            e.printStackTrace();
        }


    }

    private ItemDAO() {
    }

    public static ItemDAO getItemDAO() {
        return itemDAO;
    }

    public void addItem(Item item) throws DuplicateItemIdException {
        if (itemWrapper.getItemArrayList().contains(item)) {
            throw new DuplicateItemIdException(item.getId());
        }
    }

    public List<Item> getItemList() {
        return new ArrayList<>(itemWrapper.getItemArrayList());
    }

    public void updateItem(Item item) {
        int index = itemWrapper.getItemArrayList().indexOf(item);
        if (index != -1) {
            itemWrapper.getItemArrayList().set(index,item);
        }

    }

    private void readDataFromFile() {


    }



}
