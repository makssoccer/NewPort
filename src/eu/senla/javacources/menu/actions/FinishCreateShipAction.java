package eu.senla.javacources.menu.actions;

import eu.senla.javacources.menu.Action;
import eu.senla.javacources.menu.CreateShipContext;

public class FinishCreateShipAction implements Action {
    @Override
    public void execute() {
        CreateShipContext.setCreating(false);
    }
}
