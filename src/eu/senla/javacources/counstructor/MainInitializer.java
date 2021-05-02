package eu.senla.javacources.counstructor;

import eu.senla.javacources.entitiy.Port;
import eu.senla.javacources.entitiy.Ship;
import eu.senla.javacources.menu.MenuController;

import java.util.ArrayList;

public class MainInitializer {

    public static void init() {
        initContext();
        initMenu();
    }

    private static void initContext() {
        generatePort();
        generateWaitingShip();
    }

    private static void initMenu() {
        MenuController.getInstance().run();
    }

    private static void generateWaitingShip() {
        Context.setWaitingShips(new ArrayList<>());
    }

    private static void generatePort() {
        Port port = new Port();
        port.setCapacity(0);
        port.setShips(new ArrayList<>());
        Context.setPort(port);
    }
}
