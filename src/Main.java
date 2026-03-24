public class Main {
    public static void main(String[] args) {

        HostelManager manager = new HostelManager();

        // Adding rooms
        manager.addRoom(new SingleRoom(101));
        manager.addRoom(new DoubleRoom(102));
        manager.addRoom(new TripleRoom(103));

        // Adding students
        manager.addStudent(new Student(1, "Rahul"));
        manager.addStudent(new Student(2, "Amit"));

        // Display data
        manager.displayRooms();
        manager.displayStudents();
    }
}