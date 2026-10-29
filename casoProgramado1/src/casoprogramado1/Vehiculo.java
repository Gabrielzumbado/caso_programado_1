/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casoprogramado1;

/**
 *
 * @author gabrielzumbadoortiz
 */
public class Vehiculo {
    //datos del carro
    private String placa;
    private String marca;
    private String precio;
    private boolean VIP ;
  //contructor   
public Vehiculo(String placa, String marca, String precio, boolean VIP){
    this.placa= placa;
    this.marca= marca;
    this.precio= precio;
    this.VIP= VIP; 
}
//los getter y setter
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public boolean isVIP() {
        return VIP;
    }

    public void setVIP(boolean VIP) {
        this.VIP = VIP;
    }

   



}
