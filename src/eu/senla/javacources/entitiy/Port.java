package eu.senla.javacources.entitiy;


import java.util.List;

public class Port {

    private int capacity; //сколько воды сейчас в порту
    private List<Ship> ships; // кораблики в порту

    public List<Ship> getShips() {
        return ships;
    }

    public void setShips(List<Ship> ships) {
        this.ships = ships;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
