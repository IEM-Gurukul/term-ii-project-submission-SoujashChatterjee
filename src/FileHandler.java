public import java.io.*;
import java.util.ArrayList;

class FileHandler {

    static void saveStudents(ArrayList<Student> students) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("students.txt"));

            for (Student s : students) {
                bw.write(s.getId() + "," + s.getName() + "," +
                         s.getPreference() + "," + s.getRoomNumber());
                bw.newLine();
            }

            bw.close();
        } catch (IOException e) {
            System.out.println("Error saving data.");
        }
    }

    static void loadStudents(ArrayList<Student> students) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("students.txt"));
            String line;

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");

                int id = Integer.parseInt(data[0]);
                String name = data[1];
                String pref = data[2];
                int room = Integer.parseInt(data[3]);

                Student s = new Student(name, id, "Loaded", pref);
                s.setRoom(room);

                students.add(s);
            }

            br.close();
        } catch (Exception e) {
            System.out.println("No previous data found.");
        }
    }
}
