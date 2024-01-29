package proyecto;

import java.util.ArrayList;
import java.util.Objects;
import javax.swing.JOptionPane;

public class Banco {
    CuentaBancaria CuentaBancarias;
    String  Admin, ContrasenaAdmin;
     ArrayList<CuentaBancaria> cuentas;

    public Banco() {
        cuentas = new ArrayList<>();

        // Cuentas de 3 domicilios
        Domicilio domicilio1 = new Domicilio("calles 1", "141", "Ciudad 1", "43050", "Jalisco", "México");
        Domicilio domicilio2 = new Domicilio("calles 2", "142", "Ciudad 2", "43051", "Jalisco", "México");
        Domicilio domicilio3 = new Domicilio("calles 3", "143", "Ciudad 3", "43052", "Jalisco", "México");

        // crea 3 plasticos con numero de cuenta aleatorio y cvc aleatorio
        Plastico plastico1 = new Plastico("1234567890123456", "123", "12/12/2021", "Activo");
        Plastico plastico2 = new Plastico("1234567890123457", "123", "12/12/2021", "Activo");
        Plastico plastico3 = new Plastico("1234567890123458", "123", "12/12/2021", "Activo");

        // crea 3 cuentaHambiente aleatorias
        CuentaHambiente cuentaHambiente1 = new CuentaHambiente("Josecito", "ApellidoPaterno 1", "ApellidoMaterno 1", "FechaNacimiento 1", "RFC 1", "CURP 1", "Telefono 1", "Correo 1", "Usuario 1", "Contrasena 1", plastico1, domicilio1);
        CuentaHambiente cuentaHambiente2 = new CuentaHambiente("Alejandra", "ApellidoPaterno 2", "ApellidoMaterno 2", "FechaNacimiento 2", "RFC 2", "CURP 2", "Telefono 2", "Correo 2", "Usuario 2", "Contrasena 2", plastico2, domicilio2);
        CuentaHambiente cuentaHambiente3 = new CuentaHambiente("Max", "ApellidoPaterno 3", "ApellidoMaterno 3", "FechaNacimiento 3", "RFC 3", "CURP 3", "Telefono 3", "Correo 3", "Usuario 3", "Contrasena 3", plastico3, domicilio3);


        // crea 3 cuentas bancarias con saldo aleatorio
        CuentaBancaria cuentaBancaria1 = new CuentaBancaria(cuentaHambiente1, 1000, "1234567890123456", "1234");
        CuentaBancaria cuentaBancaria2 = new CuentaBancaria(cuentaHambiente2, 2000, "1234567890123457", "1234");
        CuentaBancaria cuentaBancaria3 = new CuentaBancaria(cuentaHambiente3, 3000, "1234567890123458", "1234");

        // agrega las cuentas al banco

        cuentas.add(cuentaBancaria1);
        cuentas.add(cuentaBancaria2);
        cuentas.add(cuentaBancaria3);







    }


    public void agregarCuenta(CuentaBancaria cuenta) {
        cuentas.add(cuenta);
    }

    public void eliminarCuenta(CuentaBancaria cuenta) {
        cuentas.remove(cuenta);
    }

    public void eliminarCuenta(String numero) {
        for (int i = 0; i < cuentas.size(); i++) {
            if (Objects.equals(cuentas.get(i).getNumeroCuenta(), numero)) {
                cuentas.remove(i);
                break;
            }
        }
    }

    public CuentaBancaria buscarCuenta(String numero, String pin) {
        //buscador de cuenta con validaciones
        boolean menu = false;
        for (CuentaBancaria cuenta : cuentas) {

            do {             
                
                if (numero.equals(cuenta.getNumeroCuenta()) && pin.equals(cuenta.getPin())) {
                    CuentaBancarias = cuenta;
                    menu = true;
                    return cuenta;

                } else {
                    JOptionPane.showMessageDialog(null, "Numero de cuenta o pin incorrecto");

                    //pedir de nuevo el numero de cuenta y pin
                    numero = JOptionPane.showInputDialog("Ingrese su numero de cuenta");
                    pin = JOptionPane.showInputDialog("Ingrese su pin");







                }

                
            } while (!menu);
            
            
        }

        return null;
        
    }

    //validar admin
    public boolean validarAdmin(String Admin, String ContrasenaAdmin){
        if(Admin.equals("Admin") && ContrasenaAdmin.equals("1234")){
            return true;
        }else{
            return false;
        }
    }




}
