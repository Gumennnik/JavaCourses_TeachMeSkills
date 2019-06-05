package item;

import java.util.ArrayList;

public class ItemWrapper {
    private ArrayList<Item>  itemArrayList= new ArrayList<>();

    public ArrayList<Item> getItemArrayList() {
        return itemArrayList;
    }

    public void setItemArrayList(ArrayList<Item> itemArrayList) {
        this.itemArrayList = itemArrayList;
    }

    public ItemWrapper(ArrayList<Item> items) {
    }

    public ItemWrapper() {
    }
}
