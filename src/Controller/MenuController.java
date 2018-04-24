package Controller;

import Model.LlegeixJson;
import Model.TracteJson.cities;
import View.Menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuController implements ActionListener {
    private Menu menu;

    public MenuController(Menu menu){
        this.menu = menu;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()){
            case "IMPORT":
                System.out.println("Import pressed");

                LlegeixJson llegeixJson = new LlegeixJson();
                cities cities = llegeixJson.llegeixJson();

                break;
            case "SEARCH":
                System.out.println("Search pressed");
                break;
            case "CALCULATE":
                System.out.println("Calculate pressed");
                break;
            case "SHUT":
                System.out.println("Shut pressed");
                break;
        }
    }
}
