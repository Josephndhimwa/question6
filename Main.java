public class Main {
    public static void main(String[] args) {
        User student = new Student("Alice", "S001");
        User lecturer = new Lecturer("Dr. Bob", "L001");
        User officer = new TransportOfficer("Mr. Charles", "T001");

        student.login();
        lecturer.login();
        officer.login();

        student.requestTransport();
        lecturer.requestTransport();
        officer.requestTransport();

        TransportManager manager = new TransportManager();
        manager.assignDriver("Bus");
        manager.assignDriver("Van", "Morning");

        Serviceable bus = new Bus();
        Serviceable van = new Van();
        Schedulable schedulableVan = new Van();
        Trackable trackableVan = new Van();

        bus.performService();
        van.performService();
        schedulableVan.schedule();
        trackableVan.trackLocation();
    }
}
