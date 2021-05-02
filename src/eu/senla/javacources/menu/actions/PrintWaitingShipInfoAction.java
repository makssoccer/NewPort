package eu.senla.javacources.menu.actions;

import eu.senla.javacources.counstructor.Context;
import eu.senla.javacources.entitiy.Ship;
import eu.senla.javacources.menu.Action;
import eu.senla.javacources.menu.MyScanner;

import java.util.Scanner;

public class PrintWaitingShipInfoAction implements Action {

    @Override
    public void execute() {
        System.out.print("Введите id ожидающего корабля: ");
        int id = MyScanner.getInstance().nextInt();
        MyScanner.getInstance().nextLine();
        for (Ship ship : Context.getWaitingShips()) {
            if (ship.getId() == id) {
                System.out.println("Объём воды: " + ship.getCapacity());
                break;
            }
        }
       // Context.getWaitingShips().forEach(x -> x.getId() == id ? System.out.println("Объём воды: " + x.getCapacity()));
    }
}
