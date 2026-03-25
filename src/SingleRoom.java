class SingleRoom extends Room {
    public SingleRoom(int roomNumber) {
        super(roomNumber, 1);
    }

    @Override
    void displayRoomDetails() {
        System.out.println("Single Room - Room No: " + roomNumber);
        System.out.println("Capacity: 1 | Occupied: " + students.size());
    }
}