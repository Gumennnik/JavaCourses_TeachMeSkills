package appliation.actions;

public class StopApplicationAction implements UserAction {
    @Override
    public String getActionName() {
        return "Stop application";
    }

    @Override
    public void makeAction() throws StopApplicationException {
        throw new StopApplicationException();
    }
}
