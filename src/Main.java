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
            System.out.println("4. View Students");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {

             case 1:
                Student s = new Student(name, id, "CSE");
                manager.addStudent(s);
                System.out.println("Student added successfully.");

             case 2:
                System.out.print("Enter Student ID to allocate room: ");
                int sid = sc.nextInt();
                manager.allocateRoom(sid);
                break;

             case 3:
                manager.viewRooms();
                break;

             case 4:
                manager.viewStudents();   // 👈 THIS IS NEW
                break;

             case 5:
                System.out.println("Exiting...");
                return;

             default:
                System.out.println("Invalid choice.");
            }
        }
    }
}