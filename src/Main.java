import Controller.MenuController;
import View.Menu;

import javax.swing.*;

public class Main {
    public static void main(String[] args){
        Menu menu = new Menu();
        MenuController menuController = new MenuController(menu);

        menu.listenController(menuController);

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                menu.setVisible(true);
            }
        });
    }
}
