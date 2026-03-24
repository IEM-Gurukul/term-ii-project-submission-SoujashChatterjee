class Student extends Person {

    private String department;
    private int roomNumber;

    public Student(String name, int id, String department) {
        super(name, id);   // calls Person constructor
        this.department = department;
        this.roomNumber = -1;
    }

    @Override
    void displayInfo() {
        System.out.println("Name: " + name + 
                           ", ID: " + id + 
                           ", Dept: " + department + 
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

    public String getName() {
        return name;
    }
}