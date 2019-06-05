package Homework08;

import Homework08.entity.DuplicateItemIDException;
import Homework08.entity.Item;
import Homework08.entity.Storage;

public class Homework08Runner {
    public static void main(String[] args) {
        Storage storage = new Storage();


        try {
            storage.addItemToStorage(new Item(4,"Table", 290));
        } catch (DuplicateItemIDException e) {
            System.out.println("Error");
            e.printStackTrace();
        }


        try {
            storage.addItemToStorage(new Item(4,"Table", 290));
        } catch (DuplicateItemIDException e) {
            System.out.println("Error");
            e.printStackTrace();
        }

        try {
            storage.addItemToStorage(new Item(4,"Table", 290));
        } catch (DuplicateItemIDException e) {
            System.out.println("Error");
            e.printStackTrace();
        }



    }
}
