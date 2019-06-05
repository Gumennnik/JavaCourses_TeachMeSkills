package Homework08.entity;

public class DuplicateItemIDException extends Exception {

    private int itemID;

    public DuplicateItemIDException(int itemID) {
        super("Invalid ID provided");
        this.itemID = itemID;
    }


    @Override
    public String getMessage() {
        return super.getMessage() + " duplicates item with id " + itemID;
    }
}
