package creational.factory.design.pattern;

public class Laptop implements Device {
    @Override
    public void spec() {
        System.out.println("Laptop is portable and it has touch screen");
    }
}
