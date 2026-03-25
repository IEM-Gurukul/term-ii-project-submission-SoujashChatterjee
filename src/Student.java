class Student extends Person {

    private String department;
    private int roomNumber;
    private String preference;

    public Student(String name, int id, String department, String preference) {
        super(name, id);
        this.department = department;
        this.preference = preference;
        this.roomNumber = -1;
    }

    @Override
    void displayInfo() {
        System.out.println("Name: " + name + ", ID: " + id +
                ", Dept: " + department +
                ", Preference: " + preference +
                ", Room: " + roomNumber);
    }

    public int getId() {
        return id;
    }

    public void setRoom(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public String getPreference() {
        return preference;
    }
}