import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        HostelManager manager = new HostelManager();

        Floor f1 = new Floor(1);
        Floor f2 = new Floor(2);
        Floor f3 = new Floor(3);

        f1.addRoom(new SingleRoom(101));
        f1.addRoom(new DoubleRoom(102));
        f1.addRoom(new TripleRoom(103));

        f2.addRoom(new SingleRoom(201));
        f2.addRoom(new DoubleRoom(202));
        f2.addRoom(new TripleRoom(203));

        f3.addRoom(new SingleRoom(301));
        f3.addRoom(new DoubleRoom(302));
        f3.addRoom(new TripleRoom(303));

        manager.addFloor(f1);
        manager.addFloor(f2);
        manager.addFloor(f3);

        FileHandler.loadStudents(manager.students, manager.floors);

        while (true) {

            System.out.println("\n===== HOSTEL MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. View Rooms");
            System.out.println("4. Search Student");
            System.out.println("5. Remove Student");
            System.out.println("6. Clear All Data");
            System.out.println("7. Exit");
            System.out.print("Enter choice: ");

            int choice;

            try {
                choice = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Invalid input!");
                sc.next();
                continue;
            }

            switch (choice) {

                case 1:

                    int id;

                    while (true) {
                        System.out.print("Enter Student ID: ");

                        try {
                            id = sc.nextInt();
                        } catch (Exception e) {
                            System.out.println("Invalid ID!");
                            sc.next();
                            continue;
                        }

                        if (manager.isDuplicateId(id)) {
                            System.out.println("Student with this ID already exists.");
                        } else {
                            break;
                        }
                    }

                    String name;

                    while (true) {
                        System.out.print("Enter Name: ");
                        name = sc.next();

                        if (name.matches("[a-zA-Z]+")) {
                            break;
                        } else {
                            System.out.println("Invalid name!");
                        }
                    }

                    String dept;

                    while (true) {
                        System.out.println("\nSelect Department:");
                        System.out.println("1. CSE");
                        System.out.println("2. Mechanical");
                        System.out.println("3. Electrical");
                        System.out.println("4. Electronics");
                        System.out.println("0. Skip");

                        int deptChoice;

                        try {
                            deptChoice = sc.nextInt();
                        } catch (Exception e) {
                            System.out.println("Invalid input!");
                            sc.next();
                            continue;
                        }

                        switch (deptChoice) {
                            case 1: dept = "CSE"; break;
                            case 2: dept = "Mechanical"; break;
                            case 3: dept = "Electrical"; break;
                            case 4: dept = "Electronics"; break;
                            case 0: dept = "NIL"; break;
                            default:
                                System.out.println("Invalid choice!");
                                continue;
                        }
                        break;
                    }

                    System.out.print("Enter Preference (Single/Double/Triple): ");
                    String pref = sc.next();

                    if (!(pref.equalsIgnoreCase("Single") ||
                          pref.equalsIgnoreCase("Double") ||
                          pref.equalsIgnoreCase("Triple"))) {
                        pref = "None";
                    }

                    Student s = new Student(name, id, dept, pref);
                    manager.addStudent(s);

                    System.out.println("Student added successfully.");
                    break;

                case 2:
                    manager.viewStudents();
                    break;

                case 3:
                    manager.viewRooms();
                    break;

                case 4:
                    System.out.print("Enter ID to search: ");
                    int sid = sc.nextInt();
                    manager.searchStudent(sid);
                    break;

                case 5:
                    System.out.print("Enter ID to remove: ");
                    int rid = sc.nextInt();
                    manager.removeStudent(rid);
                    break;

                case 6:
                    manager.clearAllData();
                    FileHandler.clearData();
                    break;

                case 7:
                    FileHandler.saveStudents(manager.students);
                    System.out.println("Data saved. Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}