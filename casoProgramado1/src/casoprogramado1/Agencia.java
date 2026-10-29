/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casoprogramado1;

import java.security.PublicKey;

/**
 *
 * @author gabrielzumbadoortiz
 */
public class Agencia {
    private String nombreCliente;
    //variables
    private double veiculosAlquilado = 0;
    private double TotalAlquiler = 0;
    private int puntosExtra= 0;
    private int recargo= 0;
    //constructor
    public Agencia(String nombreCliente){
        this.nombreCliente = nombreCliente;
        
    }
    //metodo de registtro 
    public void registrarAlquiler(double alquiler, int dia, boolean GPS, boolean seguro){
        if (dia <=0) {
            System.out.println("Erro: Cantidad minima de dias incorecta digite un numero  igual o mayor a 1");
            return;
            
        }
        
       this.veiculosAlquilado+= alquiler;
       this.TotalAlquiler++;
       
        if (GPS) {
            this.recargo += 2000;
            
        }
        if (seguro) {
            this.recargo +=5000;
            this.puntosExtra +=2;
            
        }
        if (dia > 7) {
            this.TotalAlquiler *= 0.15;
            this.TotalAlquiler++;
            
        }
    }    
    public double calcularalquiler(){
        if (TotalAlquiler==0)return 0;
        return this.veiculosAlquilado * this.TotalAlquiler;    
    }
    
       
    
}
