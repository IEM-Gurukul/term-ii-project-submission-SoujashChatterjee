import java.util.ArrayList;

class Floor {
    int floorNumber;
    ArrayList<Room> rooms;

    Floor(int floorNumber) {
        this.floorNumber = floorNumber;
        rooms = new ArrayList<>();
    }

    void addRoom(Room r) {
        rooms.add(r);
    }
}

