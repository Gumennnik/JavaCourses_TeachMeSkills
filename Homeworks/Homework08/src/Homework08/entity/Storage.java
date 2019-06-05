package Homework08.entity;

import java.util.ArrayList;

public class Storage {

    private ArrayList<Item> itemArrayList = new ArrayList<>();

    @Override
    public String toString() {
        return itemArrayList.toString();
    }

    public Storage() {
    }

    public boolean updateItem(Item item) {
        int indexOfItem = itemArrayList.indexOf(item);
        if (indexOfItem != -1) {
            itemArrayList.set(indexOfItem, item);
            return true;
        } else {
            return false;
        }


    }

    public boolean removeItemByID(int itemID) {

        return itemArrayList.remove(new Item(itemID, "", 0));
    }


    public ArrayList<Item> getAllItems() {
        return new ArrayList<>(itemArrayList);
    }

    public boolean addItemToStorage(Item item) throws DuplicateItemIDException {
        if (itemArrayList.contains(item)) {
            throw new DuplicateItemIDException(item.getId());
        }

        return itemArrayList.add(item);
    }


}
