/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package casoprogramado1;

import javax.swing.JOptionPane;

/**
 *
 * @author gabrielzumbadoortiz
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //nombre cliente
        String nombre=JOptionPane.showInputDialog("Igrese el nombre del cliente");
        Agencia control =new Agencia(nombre);
        
        //recolecion de datos del carro
        String placa= JOptionPane.showInputDialog("ingrese la placa");
        String marca= JOptionPane.showInputDialog("ingrese la marca");
        String precio = JOptionPane.showInputDialog("ingrese el precio");
        
    int VIP = JOptionPane.showConfirmDialog(null, "El cliente es un VIP","VIP", JOptionPane.YES_NO_OPTION);
    JOptionPane.showMessageDialog(null, VIP);
    boolean vipb;
    if (VIP==0)
        vipb=true;    
    
    //agregar otro carro
    
    } 
}
