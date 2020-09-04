package main;

import guis.MenuGUI;
import modelo.Menu;
import modelo.MenuItem;

public class Launcher {
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.addMenuItem(new MenuItem("Manzana",200,"1000"));
        menu.addMenuItem(new MenuItem("Pera",150,"2000"));
        menu.addMenuItem(new MenuItem("Sandia",1000,"ASD123"));
        MenuGUI menuVentana = new MenuGUI(menu);
        menuVentana.setVisible(true);
    }

}
