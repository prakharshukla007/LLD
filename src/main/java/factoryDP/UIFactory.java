package factoryDP;

import factoryDP.components.buttons.Button;
import factoryDP.components.dropdowns.Dropdown;
import factoryDP.components.menus.Menu;

public interface UIFactory {

    public Button createButton();

    public Menu createMenu();

    public Dropdown createDropdown();

}
