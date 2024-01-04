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
public class CuentaBancaria implements AccionesCliente {
    CuentaHambiente Cuenta;
    double Saldo;
    String NumeroCuenta;

    //constructores
    public CuentaBancaria(CuentaHambiente Cuenta, double Saldo, String NumeroCuenta){
        this.Cuenta = Cuenta;
        this.Saldo = Saldo;
        this.NumeroCuenta = NumeroCuenta;
    }
    //constructor vacio
    public CuentaBancaria(){

    }

    public CuentaHambiente getCuenta() {
        return Cuenta;
    }

    public void setCuenta(CuentaHambiente cuenta) {
        Cuenta = cuenta;
    }

    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(double saldo) {
        Saldo = saldo;
    }

    public String getNumeroCuenta() {
        return NumeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        NumeroCuenta = numeroCuenta;
    }

    //metodos de la interfaz
    @Override
    public void Deposito(CuentaHambiente Cuenta, double Cantidad) {
        //realizar deposito
        this.Saldo = this.Saldo + Cantidad;
        JOptionPane.showMessageDialog(null, "Deposito realizado con exito, su saldo actual es: " + this.Saldo + " pesos");


    }

    @Override
    public void Retiro(CuentaHambiente Cuenta, double Cantidad) {
        this.Saldo = this.Saldo - Cantidad;
        JOptionPane.showMessageDialog(null, "Retiro realizado con exito su saldo actual es: " + this.Saldo + " pesos");
    }

    @Override
    public void Transferencia(CuentaHambiente Cuenta, double Cantidad, String CuentaDestino) {
        this.Saldo = this.Saldo - Cantidad;
        JOptionPane.showMessageDialog(null, "Transferencia realizada con exito su saldo actual es: " + this.Saldo + " pesos");
    }

    public void PagoServicio(CuentaHambiente Cuenta, double Cantidad, Servicios Servicio) {
        this.Saldo = this.Saldo - Cantidad;
        JOptionPane.showMessageDialog(null, "Pago realizado con exito su saldo actual es: " + this.Saldo + " pesos");
    }





}
