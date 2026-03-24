import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        HostelManager manager = new HostelManager();

        // Pre-added rooms
        manager.addRoom(new SingleRoom(101));
        manager.addRoom(new DoubleRoom(102));
        manager.addRoom(new TripleRoom(103));

        while (true) {
            System.out.println("\n--- Hostel Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. Allocate Room");
            System.out.println("3. View Rooms");
            System.out.println("4. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Student ID: ");
                    int id = sc.nextInt();
                    sc.nextLine(); // clear buffer
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    Student s = new Student(id, name);
                    manager.addStudent(s);
                    break;

                case 2:
                    if (manager.students.size() > 0) {
                        Student lastStudent = manager.students.get(manager.students.size() - 1);
                        manager.allocateRoom(lastStudent);
                    } else {
                        System.out.println("No students available.");
                    }
                    break;

                case 3:
                    manager.displayRooms();
                    break;

                case 4:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}