package hotel.domain;

import java.util.Objects;

public class Room {

    private long id;
    private boolean isAvailable;
    private double price;

    public Room(long id, boolean isAvailable, double price) {
        this.id = id;
        this.isAvailable = isAvailable;
        this.price = price;
    }

    public Room() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Room room = (Room) o;
        return id == room.id && isAvailable == room.isAvailable && Double.compare(price, room.price) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, isAvailable, price);
    }

    @Override
    public String toString() {
        return String.format("Room : id - %d, isAvailable - %s, price - %.2f", id, isAvailable ? "yes" : "no", price);
    }
}
