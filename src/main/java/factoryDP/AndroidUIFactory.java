package factoryDP;

import factoryDP.components.buttons.AndroidButton;
import factoryDP.components.dropdowns.AndroidDropdown;
import factoryDP.components.menus.AndroidMenu;

public class AndroidUIFactory implements UIFactory {
    @Override
    public AndroidButton createButton() {
        return new AndroidButton();
    }

    @Override
    public AndroidMenu createMenu() {
        return new AndroidMenu();
    }

    @Override
    public AndroidDropdown createDropdown() {
        return new AndroidDropdown();
    }
}
