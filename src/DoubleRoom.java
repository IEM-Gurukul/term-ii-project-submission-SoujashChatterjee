class DoubleRoom extends Room {
    public DoubleRoom(int roomNumber) {
        super(roomNumber, 2);
    }

    @Override
    void displayRoomDetails() {
        System.out.println("Double Room - Room No: " + roomNumber);
        System.out.println("Capacity: 2 | Occupied: " + students.size());
    }
}