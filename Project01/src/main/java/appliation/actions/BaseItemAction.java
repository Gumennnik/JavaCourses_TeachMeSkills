package appliation.actions;

import item.ItemDAO;

public class BaseItemAction {
    protected static ItemDAO itemDAO = ItemDAO.getItemDAO();
}
