class SingleRoom extends Room {
    public SingleRoom(int roomNumber) {
        super(roomNumber, 1);
    }

    @Override
    void displayRoomDetails() {
        System.out.println("Single Room - Room No: " + roomNumber +
                " | Occupied: " + students.size() + "/1");
    }
}