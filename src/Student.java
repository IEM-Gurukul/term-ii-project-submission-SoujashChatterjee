public class Student {
    int id;
    String name;
    boolean hasRoom = false;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void displayStudent() {
        System.out.println("ID: " + id + ", Name: " + name);
    }
}