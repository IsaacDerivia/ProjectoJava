/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

/**
 *
 * @author isaac
 */
public class Domicilio {
    //atributos de un domicilio
    private String Calle;
    private String Numero;
    private String Colonia;
    private String CP;
    private String Ciudad;
    private String Estado;

    //constructores
    public Domicilio(String Calle, String Numero, String Colonia, String CP, String Ciudad, String Estado){
        this.Calle = Calle;
        this.Numero = Numero;
        this.Colonia = Colonia;
        this.CP = CP;
        this.Ciudad = Ciudad;
        this.Estado = Estado;
    }
    //constructor vacio
    public Domicilio(){

    }
    //getters y setters


    public String getCalle() {
        return Calle;
    }

    public void setCalle(String calle) {
        Calle = calle;
    }

    public String getNumero() {
        return Numero;
    }

    public void setNumero(String numero) {
        Numero = numero;
    }

    public String getColonia() {
        return Colonia;
    }

    public void setColonia(String colonia) {
        Colonia = colonia;
    }

    public String getCP() {
        return CP;
    }

    public void setCP(String CP) {
        this.CP = CP;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String ciudad) {
        Ciudad = ciudad;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String estado) {
        Estado = estado;
    }
}
