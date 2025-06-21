public class TransportManager {
    public void assignDriver(String vehicleType) {
        System.out.println("Driver assigned for: " + vehicleType);
    }

    public void assignDriver(String vehicleType, String shiftTime) {
        System.out.println("Driver assigned for: " + vehicleType + " during " + shiftTime + " shift.");
    }
}
