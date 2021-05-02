package eu.senla.javacources.entitiy;

import java.util.Objects;

public class Ship {

    private int id;
    private int capacity;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ship ship = (Ship) o;
        return id == ship.id && capacity == ship.capacity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, capacity);
    }
}
