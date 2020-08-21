package creational.factory.design.pattern;

public class ExecutionFactory {
    public static void main(String[] args) {
        DeviceFactory deviceFactory = new DeviceFactory();

        Device device = deviceFactory.getDevice("Desktop");
        device.spec();
        Device device1 = deviceFactory.getDevice("Monitor");
        device1.spec();
        Device device2 = deviceFactory.getDevice("Iphone");
        device2.spec();
        Device device3 = deviceFactory.getDevice("Laptop");
        device3.spec();
        Device device4 = deviceFactory.getDevice("Phone");
        device4.spec();
    }
}
