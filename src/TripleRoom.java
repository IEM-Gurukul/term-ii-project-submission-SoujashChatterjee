class TripleRoom extends Room {
    public TripleRoom(int roomNumber) {
        super(roomNumber, 3);
    }

    @Override
    void displayRoomDetails() {
        System.out.println("Triple Room - Room No: " + roomNumber);
        System.out.println("Capacity: 3 | Occupied: " + students.size());
    }
}