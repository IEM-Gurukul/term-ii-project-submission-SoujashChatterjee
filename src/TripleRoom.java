public class TripleRoom extends Room {

    public TripleRoom(int roomNumber) {
        super(roomNumber, 3);
    }

    @Override
    public void displayRoomDetails() {
        System.out.println("Triple Room - Room No: " + roomNumber);
    }
}