public class Student extends User {
    public Student(String name, String id) {
        super(name, id);
    }

    @Override
    public void requestTransport() {
        System.out.println("Student " + name + " requested transport.");
    }
}
