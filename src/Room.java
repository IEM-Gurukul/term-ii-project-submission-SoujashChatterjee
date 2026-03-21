public class Room {
    int roomNumber;
    int capacity;

    public Room(int roomNumber, int capacity) {
        this.roomNumber = roomNumber;
        this.capacity = capacity;
    }

    public void displayRoomDetails() {
        System.out.println("Room No: " + roomNumber + ", Capacity: " + capacity);
    }
}