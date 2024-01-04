/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package proyecto;

/**
 *
 * @author isaac
 */
public interface AccionesCliente {
    
    
    public void Deposito(CuentaHambiente Cuenta, double Cantidad);
    public void Retiro(CuentaHambiente Cuenta, double Cantidad);
    public void Transferencia(CuentaHambiente Cuenta, double Cantidad, String CuentaDestino);
    public void PagoServicio(CuentaHambiente Cuenta, double Cantidad, Servicios Servicio);


    
}
