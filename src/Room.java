import java.util.ArrayList;

class Room {
    protected int roomNumber;
    protected int capacity;
    protected ArrayList<Student> students;

    public Room(int roomNumber, int capacity) {
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.students = new ArrayList<>();
    }

    boolean isFull() {
        return students.size() >= capacity;
    }

    void addStudent(Student s) {
        if (!isFull()) {
            students.add(s);
            s.setRoom(roomNumber);
        }
    }

    void removeStudent(Student s) {
        students.remove(s);
    }

    void displayRoomDetails() {
        System.out.println("Room No: " + roomNumber);
        System.out.println("Occupancy: " + students.size() + "/" + capacity);

        if (students.isEmpty()) {
            System.out.println("No students assigned.");
        } else {
            System.out.println("Students:");
            for (Student s : students) {
                System.out.println("- " + s.getName());
            }
        }
    }
}