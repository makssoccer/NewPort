package eu.senla.javacources.menu.actions;

import eu.senla.javacources.menu.Action;

public class ExitAction implements Action {

    @Override
    public void execute() {
        System.out.println("Шчасця-здароўя");
        System.exit(0);
    }
}
