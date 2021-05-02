package eu.senla.javacources.menu.actions;

import eu.senla.javacources.counstructor.Context;
import eu.senla.javacources.entitiy.Ship;
import eu.senla.javacources.menu.Action;
import eu.senla.javacources.menu.CreateShipContext;
import eu.senla.javacources.menu.MyScanner;

import java.util.Scanner;

public class InitCreateShipContextAction implements Action {

    @Override
    public void execute() {
        Ship ship = new Ship();
        if (!CreateShipContext.isCreating()) {
            CreateShipContext.setShip(ship);
            Context.getWaitingShips().add(ship);
            System.out.print("Введите id корабля: ");
            ship.setId(MyScanner.getInstance().nextInt());
            MyScanner.getInstance().nextLine();
            CreateShipContext.setCreating(true);
        }
        ship = CreateShipContext.getShip();
        System.out.println("id корабля: " + ship.getId() + ", Объём воды: " + ship.getCapacity());

    }
}
