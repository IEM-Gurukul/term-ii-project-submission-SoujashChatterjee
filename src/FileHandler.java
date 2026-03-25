import java.io.*;
import java.util.ArrayList;

class FileHandler {

    static void saveStudents(ArrayList<Student> students) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("students.txt"));

            for (Student s : students) {
                bw.write(
                    s.getId() + "," +
                    s.getName() + "," +
                    s.getDepartment() + "," +
                    s.getPreference() + "," +
                    s.getRoomNumber()
                );
                bw.newLine();
            }

            bw.close();
        } catch (IOException e) {
            System.out.println("Error saving data.");
        }
    }

    static void loadStudents(ArrayList<Student> students, ArrayList<Floor> floors) {

        try {
            File file = new File("students.txt");

            if (!file.exists()) {
                return;
            }

            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;

            while ((line = br.readLine()) != null) {

                String[] data = line.split(",");

                if (data.length < 5) continue;

                int id = Integer.parseInt(data[0]);
                String name = data[1];
                String dept = data[2];
                String pref = data[3];
                int roomNo = Integer.parseInt(data[4]);

                Student s = new Student(name, id, dept, pref);
                s.setRoom(roomNo);

                students.add(s);

                for (Floor f : floors) {
                    for (Room r : f.rooms) {
                        if (r.roomNumber == roomNo) {
                            r.addStudent(s);
                        }
                    }
                }
            }

            br.close();

        } catch (Exception e) {
            System.out.println("Error loading data.");
        }
    }

    static void clearData() {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("students.txt"));
            bw.write("");
            bw.close();
            System.out.println("All data cleared successfully.");
        } catch (IOException e) {
            System.out.println("Error clearing data.");
        }
    }
}
