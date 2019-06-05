package Homework08.entity;

import java.util.Comparator;

public class ItemPriceComparator implements Comparator<Item> {
    @Override
    public int compare(Item o1, Item o2) {
        return o1.getPrice() - o2.getPrice();
    }



}
