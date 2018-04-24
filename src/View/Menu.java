package View;

import Controller.MenuController;

import javax.swing.*;
import java.awt.*;

public class Menu extends JFrame{
    private JButton import_map;
    private JButton search_city;
    private JButton calculate_route;
    private JButton shut_down;

    public Menu(){
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel jp = new JPanel(new GridLayout(4, 1));

        import_map = new JButton("Import Map");
        search_city = new JButton("Search City");
        calculate_route = new JButton("Calculate Route");
        shut_down = new JButton("Shut Down");

        jp.add(import_map);
        jp.add(search_city);
        jp.add(calculate_route);
        jp.add(shut_down);

        getContentPane().add(jp);

        setSize(300, 300);
        setLocation(500, 280);
    }

    public void listenController(MenuController menuController){
        import_map.addActionListener(menuController);
        search_city.addActionListener(menuController);
        calculate_route.addActionListener(menuController);
        shut_down.addActionListener(menuController);

        import_map.setActionCommand("IMPORT");
        search_city.setActionCommand("SEARCH");
        calculate_route.setActionCommand("CALCULATE");
        shut_down.setActionCommand("SHUT");
    }
}
