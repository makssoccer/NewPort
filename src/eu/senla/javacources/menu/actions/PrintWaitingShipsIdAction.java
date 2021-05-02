package eu.senla.javacources.menu.actions;

import eu.senla.javacources.counstructor.Context;
import eu.senla.javacources.menu.Action;

public class PrintWaitingShipsIdAction implements Action {

    @Override
    public void execute() {
        System.out.println("Ожидают " + Context.getWaitingShips().size() + " кораблей");
        if (Context.getWaitingShips().size() != 0) {
            System.out.println("Список ожидающих коблей: ");
            Context.getWaitingShips().forEach(x -> System.out.println(x.getId()));
        }
    }
}
