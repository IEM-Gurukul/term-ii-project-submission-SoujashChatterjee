public class DoubleRoom extends Room {

    public DoubleRoom(int roomNumber) {
        super(roomNumber, 2);
    }

    @Override
    public void displayRoomDetails() {
        System.out.println("Double Room - Room No: " + roomNumber);
    }
}