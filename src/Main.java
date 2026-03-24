public class Main {
    public static void main(String[] args) {

        HostelManager manager = new HostelManager();

        // Rooms
        manager.addRoom(new SingleRoom(101));
        manager.addRoom(new DoubleRoom(102));
        manager.addRoom(new TripleRoom(103));

        // Students
        Student s1 = new Student(1, "Rahul");
        Student s2 = new Student(2, "Amit");

        manager.addStudent(s1);
        manager.addStudent(s2);

        // Allocation
        manager.allocateRoom(s1);
        manager.allocateRoom(s2);

        // Display
        manager.displayRooms();
    }
}