package factoryDP.components.buttons;

public class IOSButton implements Button {
    @Override
    public void changeSize() {
        System.out.println("Change size from iOS");
    }
}
