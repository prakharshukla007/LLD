package factoryDP;

public class Flutter {

    private SupportedPlatform supportedPlatform;

    public Flutter(SupportedPlatform supportedPlatform) {
        this.supportedPlatform = supportedPlatform;
    }

    public void setTheme() {
        System.out.println("Setting theme");
    }

    public void setRefreshRate() {
        System.out.println("Setting refresh rate");
    }

    public UIFactory createUIFactory() {
        if(supportedPlatform == SupportedPlatform.ANDROID) {
            return new AndroidUIFactory();
        } else {
            return new IOSUIFactory();
        }
    }

}
