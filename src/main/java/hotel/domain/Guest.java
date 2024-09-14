package hotel.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Guest {

    private String name;
    private String email;
    private List<Room> rooms = new ArrayList<>();

    public Guest() {
    }

    public Guest(String name, String email) {
        this.name = name;
        this.email = email;
    }


    public void addRoom(Room room) {
        if (room.isAvailable()) {
            rooms.add(room);
        }
    }

    public List<Room> getBookedRooms() {
        return rooms
                .stream()
                .filter(x -> x.isAvailable())
                .toList();
    }

    public void clearAllRooms() {
        rooms.clear();
    }

//    public double getRoomPriceById (long id) {
//       return rooms
//               .stream()
//               .filter(x -> x.getId())
//               .mapToDouble(Room::getId)
//
//    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Guest guest = (Guest) o;
        return Objects.equals(name, guest.name) && Objects.equals(email, guest.email) && Objects.equals(rooms, guest.rooms);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, email, rooms);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("Guest: name - ");
        builder.append(name)
                .append(", email: ")
                .append(email)
                .append(", room list: \n");
        for (Room room : rooms) {
            builder.append(room)
                    .append("\n");
        }
        return builder.toString();
    }
}
