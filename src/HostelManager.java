import java.util.ArrayList;

class HostelManager {

    ArrayList<Student> students = new ArrayList<>();
    ArrayList<Room> rooms = new ArrayList<>();

    void addRoom(Room r) {
        rooms.add(r);
    }

    void addStudent(Student s) {
        students.add(s);

        for (Room r : rooms) {
            if (!r.isFull()) {
                r.addStudent(s);
                System.out.println("Room allocated: " + r.roomNumber);
                return;
            }
        }

        System.out.println("No rooms available.");
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
            System.out.println("----------------------");
        }
    }

    void removeStudent(int id) {

        Student found = null;

        for (Student s : students) {
            if (s.getId() == id) {
                found = s;
                break;
            }
        }

        if (found != null) {

            for (Room r : rooms) {
                if (r.roomNumber == found.getRoomNumber()) {
                    r.removeStudent(found);
                    break;
                }
            }

            students.remove(found);
            System.out.println("Student removed and room updated.");

        } else {
            System.out.println("Student not found.");
        }
    }
}