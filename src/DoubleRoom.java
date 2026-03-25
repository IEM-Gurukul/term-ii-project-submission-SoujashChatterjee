class DoubleRoom extends Room {
    public DoubleRoom(int roomNumber) {
        super(roomNumber, 2);
    }

    @Override
    void displayRoomDetails() {
        System.out.println("Double Room - Room No: " + roomNumber +
                " | Occupied: " + students.size() + "/2");
    }
}