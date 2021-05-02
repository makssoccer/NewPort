package eu.senla.javacources.menu;

import eu.senla.javacources.entitiy.Ship;

public class CreateShipContext {
    private static Ship ship;
    private static boolean creating;

    public static boolean isCreating() {
        return creating;
    }

    public static void setCreating(boolean creating) {
        CreateShipContext.creating = creating;
    }

    public static void setShip(Ship ship) {
        CreateShipContext.ship = ship;
    }

    public static Ship getShip() {
        return ship;
    }
}
