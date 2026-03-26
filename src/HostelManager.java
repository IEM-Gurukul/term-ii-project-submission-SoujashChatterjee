import java.util.ArrayList;
import java.util.Random;

class HostelManager {

    ArrayList<Student> students = new ArrayList<>();
    ArrayList<Floor> floors = new ArrayList<>();

    void addFloor(Floor f) {
        floors.add(f);
    }

    boolean isDuplicateId(int id) {
        for (Student s : students) {
            if (s.getId() == id) {
                return true;
            }
        }
        return false;
    }

    void addStudent(Student s) {

        students.add(s);

        ArrayList<Room> preferredRooms = new ArrayList<>();

        for (Floor f : floors) {
            for (Room r : f.rooms) {

                if (s.getPreference().equalsIgnoreCase("Single") && r instanceof SingleRoom && !r.isFull())
                    preferredRooms.add(r);

                else if (s.getPreference().equalsIgnoreCase("Double") && r instanceof DoubleRoom && !r.isFull())
                    preferredRooms.add(r);

                else if (s.getPreference().equalsIgnoreCase("Triple") && r instanceof TripleRoom && !r.isFull())
                    preferredRooms.add(r);
            }
        }

        Random rand = new Random();

        if (!preferredRooms.isEmpty()) {
            Room chosen = preferredRooms.get(rand.nextInt(preferredRooms.size()));
            chosen.addStudent(s);
            System.out.println("Allocated preferred room: " + chosen.roomNumber);
            return;
        }

        ArrayList<Room> availableRooms = new ArrayList<>();

        for (Floor f : floors) {
            for (Room r : f.rooms) {
                if (!r.isFull()) {
                    availableRooms.add(r);
                }
            }
        }

        if (!availableRooms.isEmpty()) {
            Room chosen = availableRooms.get(rand.nextInt(availableRooms.size()));
            chosen.addStudent(s);
            System.out.println("Allocated random room: " + chosen.roomNumber);
        } else {
            System.out.println("No rooms available.");
        }
    }

    void searchStudent(int id) {
        for (Student s : students) {
            if (s.getId() == id) {
                s.displayInfo();
                return;
            }
        }
        System.out.println("Student not found.");
    }

    void removeStudent(int id) {

        Student found = null;

        for (Student s : students) {
            if (s.getId() == id) {
                found = s;
                break;
            }
        }

        if (found == null) {
            System.out.println("Student not found.");
            return;
        }

        for (Floor f : floors) {
            for (Room r : f.rooms) {
                if (r.roomNumber == found.getRoomNumber()) {
                    r.removeStudent(found);
                }
            }
        }

        students.remove(found);
        System.out.println("Student removed and room vacated.");
    }

    void viewRooms() {
        for (Floor f : floors) {
            System.out.println("Floor " + f.floorNumber);
            for (Room r : f.rooms) {
                r.displayRoomDetails();
            }
            System.out.println("----------------------");
        }
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

    void clearAllData() {
        students.clear();

        for (Floor f : floors) {
            for (Room r : f.rooms) {
                r.students.clear();
            }
        }

        System.out.println("Memory cleared.");
    }
}