package item;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;

@XmlRootElement
public class ItemWrapper {
    private ArrayList<Item>  itemArrayList= new ArrayList<>();

    public ArrayList<Item> getItemArrayList() {
        return itemArrayList;
    }

    public void setItemArrayList(ArrayList<Item> itemArrayList) {
        this.itemArrayList = itemArrayList;
    }

    public ItemWrapper(ArrayList<Item> items) {
        this.itemArrayList = items;
    }

    public ItemWrapper() {
    }

    @Override
    public String toString() {
        return "ItemWrapper{" +
                "itemArrayList=" + itemArrayList +
                '}';
    }
}
