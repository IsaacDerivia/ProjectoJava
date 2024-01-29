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
    
    
    public void Deposito(CuentaBancaria Cuenta, double Cantidad);
    public void Retiro(CuentaBancaria Cuenta, double Cantidad);
    public void Transferencia(CuentaBancaria Cuenta, double Cantidad, String CuentaDestino);
    public void PagoServicio(CuentaBancaria Cuenta, double Cantidad, Servicios Servicio);


    
}
