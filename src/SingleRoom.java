public class SingleRoom extends Room {

    public SingleRoom(int roomNumber) {
        super(roomNumber, 1);
    }

    @Override
    public void displayRoomDetails() {
        System.out.println("Single Room - Room No: " + roomNumber);
    }
}