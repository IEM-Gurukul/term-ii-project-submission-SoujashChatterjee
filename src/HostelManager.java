import java.util.ArrayList;

public class HostelManager {

    ArrayList<Student> students = new ArrayList<>();
    ArrayList<Room> rooms = new ArrayList<>();

    public void addStudent(Student s) {
        students.add(s);
        System.out.println("Student added successfully.");
    }

    public void addRoom(Room r) {
        rooms.add(r);
        System.out.println("Room added successfully.");
    }

    public void displayStudents() {
        for (Student s : students) {
            s.displayStudent();
        }
    }

    public void displayRooms() {
        for (Room r : rooms) {
            r.displayRoomDetails();
        }
    }
}