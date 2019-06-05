package appliation.actions;

public interface UserAction {
    String getActionName();
    void makeAction() throws StopApplicationException;
}
