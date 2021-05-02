package eu.senla.javacources.menu.actions;

import eu.senla.javacources.entitiy.Ship;
import eu.senla.javacources.menu.Action;
import eu.senla.javacources.menu.CreateShipContext;

public class AddBigContainerToShipAction implements Action {

    @Override
    public void execute() {
        Ship ship = CreateShipContext.getShip();
        if (ship.getCapacity() + 1000 <= 2000) {
            ship.setCapacity(ship.getCapacity() + 1000);
        }
        else{
            System.out.println("Ошибка. Недостаточно места на корабле!!!");
        }
        System.out.println("id корабля: " + ship.getId() + ", Объём воды: " + ship.getCapacity());
    }
}
