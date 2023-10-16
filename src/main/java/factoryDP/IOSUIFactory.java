package factoryDP;

import factoryDP.components.buttons.IOSButton;
import factoryDP.components.dropdowns.IOSDropdown;
import factoryDP.components.menus.IOSMenu;

public class IOSUIFactory implements UIFactory {
    @Override
    public IOSButton createButton() {
        return new IOSButton();
    }

    @Override
    public IOSMenu createMenu() {
        return new IOSMenu();
    }

    @Override
    public IOSDropdown createDropdown() {
        return new IOSDropdown();
    }
}
