package item;

public class DuplicateItemIdException extends Exception {
    private int duplicatedId;

    public DuplicateItemIdException(int id) {
        this.duplicatedId = id;
    }

    public int getDuplicatedId() {
        return duplicatedId;
    }

    public void setDuplicatedId(int duplicatedId) {
        this.duplicatedId = duplicatedId;
    }
}
