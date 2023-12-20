/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

/**
 *
 * @author isaac
 */
public class Plastico {
        private String Numero;
        private String CVC;
        private String Fecha;
        //status
        private String Status;

        public Plastico(String Numero, String CVC, String Fecha, String Status){
            this.Numero = Numero;
            this.CVC = CVC;
            this.Fecha = Fecha;
            this.Status = Status;
        }
        //constructor vacio
        public Plastico(){

        }

    public String getNumero() {
        return Numero;
    }

    public void setNumero(String numero) {
        Numero = numero;
    }

    public String getCVC() {
        return CVC;
    }

    public void setCVC(String CVC) {
        this.CVC = CVC;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String fecha) {
        Fecha = fecha;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }
}
