package eu.senla.javacources.counstructor;

import eu.senla.javacources.entitiy.Port;
import eu.senla.javacources.entitiy.Ship;

import java.util.List;

public class Context {

    private static Port port;
    private static List<Ship> waitingShips;

    public static Port getPort() {
        return port;
    }

    public static void  setPort(Port port) {
        Context.port = port;
    }

    public static List<Ship> getWaitingShips() {
        return waitingShips;
    }

    public static void setWaitingShips(List<Ship> waitingShips) {
        Context.waitingShips = waitingShips;
    }
}
