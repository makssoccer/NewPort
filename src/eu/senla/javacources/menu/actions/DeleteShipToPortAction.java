package eu.senla.javacources.menu.actions;

import eu.senla.javacources.counstructor.Context;
import eu.senla.javacources.entitiy.Ship;
import eu.senla.javacources.menu.Action;
import eu.senla.javacources.menu.MyScanner;

import java.util.List;
import java.util.Scanner;

public class DeleteShipToPortAction implements Action {

    @Override
    public void execute() {
        System.out.print("Введите id корабля который хотите удалить из порта: ");
        int id = MyScanner.getInstance().nextInt();
        MyScanner.getInstance().nextLine();
        List<Ship> ships = Context.getPort().getShips();
        for (int i = 0; i < ships.size(); i++) {
            Ship ship = ships.get(i);
            if (ship.getId() == id) {
                ships.remove(ship);
                break;
            }
        }
    }
}
