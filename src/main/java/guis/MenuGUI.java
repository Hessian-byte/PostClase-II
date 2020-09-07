package guis;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.Menu;
import modelo.MenuItem;
import modelo.OrderItem;

public class MenuGUI extends JFrame implements ActionListener {
    private JPanel menuGui;
    private JButton eliminarOrderItemButton;
    private JButton agregarALaOrdenButton;
    private JScrollPane tablaScrollPanel;
    private JTable catalogoTabla;
    private DefaultTableModel catalogoModeloTabla;
    private JScrollPane scrollPanelTabla;
    private JTable ordenTabla;
    private DefaultTableModel ordenModeloTabla;
    private JTextField cantidadTextField1;
    private JTextField textField1;
    private JCheckBox deseaAgregarUnNumeroCheckBox;
    private JTextField textField2;
    private JButton emitirOrdenButton;
    private JTable ordenesTabla;
    private JButton eliminarOrdenButton;
    private Menu menu;



    public MenuGUI(Menu menu) throws HeadlessException {
        this.menu = menu; //el menu debe ser creado antes de lanzar la ventana, para ello se crea el menu en el Launcher
        setLayout(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setContentPane(menuGui);
        this.pack();
        this.setResizable(true);
        agregarALaOrdenButton.addActionListener(this);
        eliminarOrderItemButton.addActionListener(this);
        deseaAgregarUnNumeroCheckBox.addActionListener(this);
        emitirOrdenButton.addActionListener(this);
        eliminarOrdenButton.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==agregarALaOrdenButton){

                int filaSelecionada = catalogoTabla.getSelectedRow();
                if (filaSelecionada == -1){
                    JOptionPane.showMessageDialog(menuGui,"Usted no ha seleccionado un Item del menu","Error",JOptionPane.ERROR_MESSAGE);
                    return;
                }
                MenuItem menuItemSeleccionado = menu.getMenuItem(filaSelecionada);
            try {
                int cantidad = Integer.parseInt(cantidadTextField1.getText());
                if (cantidad>0){
                    OrderItem oi = new OrderItem(menuItemSeleccionado,cantidad);
                    ordenModeloTabla.addRow(oi.getArrayObject());

                }else{
                    JOptionPane.showMessageDialog(menuGui,"La cantidad no puede ser 0 ó negativa","Error",JOptionPane.ERROR_MESSAGE);
                }
            }catch (NumberFormatException nfe){
                JOptionPane.showMessageDialog(menuGui,"Debe ingresar un numero positivo en la cantidad","Error",JOptionPane.ERROR_MESSAGE);
                cantidadTextField1.setText("");
            }
        }
        if (e.getSource() == eliminarOrderItemButton){
            int filaSelecionada = ordenTabla.getSelectedRow();
            if (filaSelecionada == -1){
                JOptionPane.showMessageDialog(menuGui,"Usted no ha seleccionado un Item de la orden","Error",JOptionPane.ERROR_MESSAGE);
                return;
            }
            ordenModeloTabla.removeRow(filaSelecionada);
            ordenTabla.setModel(ordenModeloTabla);
        }
        if(e.getSource() == deseaAgregarUnNumeroCheckBox){

        }
    }


    private void createUIComponents() {
        // TODO: place custom component creation code here
        //
        catalogoModeloTabla = new DefaultTableModel();
        catalogoModeloTabla.addColumn("ProductName");
        catalogoModeloTabla.addColumn("Precio");
        catalogoModeloTabla.addColumn("Codigo");

        ordenModeloTabla = new DefaultTableModel();
        ordenModeloTabla.addColumn("ProductName");
        ordenModeloTabla.addColumn("Cantidad");
        ordenModeloTabla.addColumn("Precio");



        catalogoModeloTabla.addRow(menu.getArrayMenuItem(0));
        catalogoModeloTabla.addRow(menu.getArrayMenuItem(1));
        catalogoModeloTabla.addRow(menu.getArrayMenuItem(2));
        catalogoTabla = new JTable(catalogoModeloTabla);
        ordenTabla = new JTable(ordenModeloTabla);

    }
}
