public class Main {
    public static void main(String[] args) {

        Room r1 = new SingleRoom(101);
        Room r2 = new DoubleRoom(102);
        Room r3 = new TripleRoom(103);

        r1.displayRoomDetails();
        r2.displayRoomDetails();
        r3.displayRoomDetails();
    }
}