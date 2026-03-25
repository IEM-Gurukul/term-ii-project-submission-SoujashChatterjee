import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        HostelManager manager = new HostelManager();

        Floor f1 = new Floor(1);
        Floor f2 = new Floor(2);

        f1.addRoom(new SingleRoom(101));
        f1.addRoom(new DoubleRoom(102));
        f1.addRoom(new TripleRoom(103));

        f2.addRoom(new SingleRoom(201));
        f2.addRoom(new DoubleRoom(202));
        f2.addRoom(new TripleRoom(203));

        manager.addFloor(f1);
        manager.addFloor(f2);

        while (true) {
            System.out.println("\n===== HOSTEL MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Rooms");
            System.out.println("3. View Students");
            System.out.println("4. Exit");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Student ID: ");
                    int id = sc.nextInt();

                    System.out.print("Enter Name: ");
                    String name = sc.next();

                    System.out.print("Enter Preference (Single/Double/Triple): ");
                    String pref = sc.next();

                    Student s = new Student(name, id, "CSE", pref);
                    manager.addStudent(s);

                    System.out.println("Student added successfully.");
                    break;

                case 2:
                    manager.viewRooms();
                    break;

                case 3:
                    manager.viewStudents();
                    break;

                case 4:
                    return;
            }
        }
    }
}