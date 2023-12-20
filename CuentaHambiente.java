/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

import javax.swing.*;

/**
 *
 * @author isaac
 */
public class CuentaHambiente extends Personas{
    private Plastico Tarjeta;
    private Domicilio Domicilio;

    //constructores
    public CuentaHambiente(String Nombre, String ApellidoPaterno, String ApellidoMaterno, String FechaNacimiento, String RFC, String CURP, String Telefono, String Correo, String Usuario, String Contrasena, Plastico Tarjeta, Domicilio Domicilio) {
        super(Nombre, ApellidoPaterno, ApellidoMaterno, FechaNacimiento, RFC, CURP, Telefono, Correo, Usuario, Contrasena);
        this.Tarjeta = Tarjeta;
        this.Domicilio = Domicilio;
    }

    //constructor vacio
    public CuentaHambiente(){

    }

    public Plastico getTarjeta() {
        return Tarjeta;
    }

    public void setTarjeta(Plastico tarjeta) {
        Tarjeta = tarjeta;
    }

    public proyecto.Domicilio getDomicilio() {
        return Domicilio;
    }

    public void setDomicilio(proyecto.Domicilio domicilio) {
        Domicilio = domicilio;
    }
}
