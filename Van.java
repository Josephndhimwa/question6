public class Van implements Serviceable, Schedulable, Trackable {
    @Override
    public void performService() {
        System.out.println("Van is being serviced.");
    }

    @Override
    public void schedule() {
        System.out.println("Van is scheduled for route.");
    }

    @Override
    public void trackLocation() {
        System.out.println("Van location is being tracked.");
    }
}
