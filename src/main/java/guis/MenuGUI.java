package guis;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import modelo.Menu;
import modelo.MenuItem;

public class MenuGUI extends JFrame implements ActionListener {
    private JPanel menuGui;
    private JTable table1;
    private JTextField productNametextField;
    private JTextField priceTextField;
    private JTextField CodeTextField;
    private JButton eliminarButton;
    private JButton button3;
    private JButton actualizarButton;
    private Menu menu;
    private String[] columnNames = {"ProductName","Precio","Codigo"};

    public void inicializarMenu(){
        menu = new Menu();
        menu.addMenuItem(new MenuItem("Manzana",200,"1000"));
        menu.addMenuItem(new MenuItem("Pera",150,"2000"));
        menu.addMenuItem(new MenuItem("Sandia",1000,"ASD123"));
    }
    public MenuGUI() throws HeadlessException {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                //System.out.println(info.getName());
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
            // If Nimbus is not available, you can set the GUI to another look and feel.
            System.out.println("Nimbus not Avaible");
        }
        inicializarMenu();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setContentPane(menuGui);
        this.pack();
        this.setResizable(true);
        table1 = new JTable(null,columnNames);


    }

    public void actionPerformed(ActionEvent e) {

    }
}
