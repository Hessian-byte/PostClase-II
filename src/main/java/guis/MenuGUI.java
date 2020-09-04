package guis;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.Menu;
import modelo.MenuItem;

public class MenuGUI extends JFrame implements ActionListener {
    private JPanel menuGui;

    private JTextField CodeTextField;
    private JButton eliminarOrderItemButton;
    private JButton agregarALaOrdenButton;
    private JScrollPane tablaScrollPanel;
    private JList list2;
    private JTable tablaCatalogo;
    private JScrollPane scrollPanelTabla;
    private Menu menu;
    private String[] columnNames = {"ProductName","Precio","Codigo"};


    public MenuGUI(Menu menu) throws HeadlessException {
        this.menu = menu; //el menu debe ser creado antes de lanzar la ventana, para ello se crea el menu en el Launcher
        setLayout(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setContentPane(menuGui);
        this.pack();
        this.setResizable(true);
    }

    public void actionPerformed(ActionEvent e) {

    }


    private void createUIComponents() {
        // TODO: place custom component creation code here
        //
        DefaultTableModel modeloTabla = new DefaultTableModel();
        modeloTabla.addColumn("ProductName");
        modeloTabla.addColumn("Precio");
        modeloTabla.addColumn("Codigo");

        modeloTabla.addRow(menu.getArrayMenuItem(0));
        modeloTabla.addRow(menu.getArrayMenuItem(1));
        modeloTabla.addRow(menu.getArrayMenuItem(2));

        tablaCatalogo = new JTable(modeloTabla);
        tablaCatalogo.setModel(modeloTabla);
        tablaCatalogo.setVisible(true);
        tablaCatalogo.setBounds(0,0,100,100);
        add(tablaCatalogo);

    }
}
