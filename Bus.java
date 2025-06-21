public class Bus implements Serviceable, Schedulable {
    @Override
    public void performService() {
        System.out.println("Bus is being serviced.");
    }

    @Override
    public void schedule() {
        System.out.println("Bus is scheduled for route.");
    }
}
