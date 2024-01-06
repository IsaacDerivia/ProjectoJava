/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

/**
 *
 * @author isaac
 */
public class Servicios {
      private String Nombre;
      private double Saldo;

    public Servicios() {
    }

    public Servicios(String Nombre, double Saldo) {
        this.Nombre = Nombre;
        this.Saldo = Saldo;
        
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(double Saldo) {
        this.Saldo = Saldo;
    }


        
    
    
    
    
    
}
