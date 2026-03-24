import java.util.ArrayList;

public class HostelManager {

    ArrayList<Student> students = new ArrayList<>();
    ArrayList<Room> rooms = new ArrayList<>();

    void addStudent(Student s) {
     students.add(s);

     // allocate room immediately
     for (Room r : rooms) {
        if (!r.isOccupied) {
            r.isOccupied = true;
            s.setRoom(r.roomNumber);

            System.out.println("Room allocated: " + r.roomNumber);
            return;
        }
     }
     System.out.println("No rooms available for allocation.");
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

    void allocateRoom(int studentId) {
     for (Student s : students) {
        if (s.getId() == studentId) {

            for (Room r : rooms) {
                if (!r.isOccupied) {
                    r.isOccupied = true;
                    s.setRoom(r.roomNumber);
                    System.out.println("Room allocated: " + r.roomNumber);
                    return;
                }
            }

            System.out.println("No rooms available.");
            return;
        }
     }

     System.out.println("Student not found.");
   }
        
    void viewStudents() {
     if (students.isEmpty()) {
        System.out.println("No students found.");
        return;
     }

     for (Student s : students) {
        s.displayInfo();
     }
    }

    void viewRooms() {
     if (rooms.isEmpty()) {
        System.out.println("No rooms available.");
        return;
     }

     for (Room r : rooms) {
        r.displayRoomDetails();

        if (r.isOccupied) {
            System.out.println("Status: Occupied");
        } else {
            System.out.println("Status: Available");
        }

        System.out.println("----------------------");
     }
    }
}