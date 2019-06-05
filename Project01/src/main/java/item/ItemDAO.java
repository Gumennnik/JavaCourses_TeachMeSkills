package item;

import java.util.ArrayList;
import java.util.List;


//TODO: Saving to xml
//TODO: Loading from xml at program start
public class ItemDAO {
    private ItemWrapper itemWrapper = new ItemWrapper( new ArrayList<Item>());
    private static ItemDAO itemDAO;
    {
        itemDAO = new ItemDAO();
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



}
