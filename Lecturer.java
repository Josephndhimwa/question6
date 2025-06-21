public class Lecturer extends User {
    public Lecturer(String name, String id) {
        super(name, id);
    }

    @Override
    public void requestTransport() {
        System.out.println("Lecturer " + name + " requested academic transport.");
    }
}
