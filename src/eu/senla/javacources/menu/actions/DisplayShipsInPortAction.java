package eu.senla.javacources.menu.actions;

import eu.senla.javacources.counstructor.Context;
import eu.senla.javacources.menu.Action;

public class DisplayShipsInPortAction implements Action {

    @Override
    public void execute() {
        System.out.println("Порт содержит " + Context.getPort().getShips().size() + " кораблей");
        if(!Context.getPort().getShips().isEmpty()){
            System.out.println("Список коблей в порту: ");
            Context.getPort().getShips().forEach(x -> System.out.println(x.getId()));
        }
    }
}
