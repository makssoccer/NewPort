package eu.senla.javacources.menu.actions;

import eu.senla.javacources.counstructor.Context;
import eu.senla.javacources.entitiy.Ship;
import eu.senla.javacources.menu.Action;
import eu.senla.javacources.menu.MyScanner;

import java.util.Scanner;

public class AddShipToPortAction implements Action {

    @Override
    public void execute() {
        System.out.print("Введите id ожидающего корабля котрый хотите добавитьв порт: ");
        int id = MyScanner.getInstance().nextInt();
        MyScanner.getInstance().nextLine();
        for (int i = 0; i < Context.getWaitingShips().size(); i++) {
            Ship ship = Context.getWaitingShips().get(i);
            if(ship.getId() == id){
                System.out.println("Объём воды: " + ship.getCapacity());
                Context.getPort().setCapacity(Context.getPort().getCapacity() + ship.getCapacity());
                ship.setCapacity(0);
                Context.getPort().getShips().add(ship);
                Context.getWaitingShips().remove(ship);
                break;
            }
        }
    }
}
