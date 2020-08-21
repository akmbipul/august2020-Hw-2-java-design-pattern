package creational.factory.design.pattern;

public class DeviceFactory {
    public Device getDevice(String DeviceType){
        if(DeviceType == null){
            return null;
        }
        if(DeviceType.equalsIgnoreCase("Desktop")){
            return new Desktop();
        } else if(DeviceType.equalsIgnoreCase("Monitor")){
            return new Monitor();
        } else if(DeviceType.equalsIgnoreCase("Iphone")){
            return new Iphone();
        }else if(DeviceType.equalsIgnoreCase("Laptop")){
            return new Laptop();
        }else if(DeviceType.equalsIgnoreCase("Phone")){
            return (Device) new Phone();
        }
        return null;
    }
}
