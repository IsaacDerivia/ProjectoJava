import javax.swing.JOptionPane;

public class NuevaCuenta extends CuentaHambiente  {

    public static void main (String[] args) {
        NuevaCuenta CuentaPrueba = new NuevaCuenta();
        CuentaPrueba.setNombre(JOptionPane.showInputDialog("Nombre"));
        CuentaPrueba.setApellidoPaterno(JOptionPane.showInputDialog("Apellido Paterno"));
        CuentaPrueba.setApellidoMaterno(JOptionPane.showInputDialog("Apellido Materno"));
        CuentaPrueba.setFechaNacimiento(JOptionPane.showInputDialog("Fecha de Nacimiento"));
        CuentaPrueba.setRFC(JOptionPane.showInputDialog("RFC"));
        CuentaPrueba.setCURP(JOptionPane.showInputDialog("CURP"));
        CuentaPrueba.setTelefono(JOptionPane.showInputDialog("Telefono"));
        CuentaPrueba.setCorreo(JOptionPane.showInputDialog("Correo"));
        CuentaPrueba.setUsuario(JOptionPane.showInputDialog("Usuario"));
        CuentaPrueba.setContrasena(JOptionPane.showInputDialog("Contraseña"));
        CuentaPrueba.setTarjeta(new Plastico());
        CuentaPrueba.setDomicilio(new Domicilio());
        CuentaPrueba.getTarjeta().setNumero(JOptionPane.showInputDialog("Numero de Tarjeta"));
        CuentaPrueba.getTarjeta().setFechaVencimiento(JOptionPane.showInputDialog("Fecha de Vencimiento"));
        CuentaPrueba.getTarjeta().setCVV(JOptionPane.showInputDialog("CVV"));
        CuentaPrueba.getDomicilio().setCalle(JOptionPane.showInputDialog("Calle"));
        CuentaPrueba.getDomicilio().setNumero(JOptionPane.showInputDialog("Numero"));
        CuentaPrueba.getDomicilio().setColonia(JOptionPane.showInputDialog("Colonia"));
        CuentaPrueba.getDomicilio().setCP(JOptionPane.showInputDialog("Codigo Postal"));
        CuentaPrueba.getDomicilio().setCiudad(JOptionPane.showInputDialog("Ciudad"));
        CuentaPrueba.getDomicilio().setEstado(JOptionPane.showInputDialog("Estado"));
        
    }

    
    public NuevaCuenta() {
        super();
    }

    public NuevaCuenta(String Nombre, String ApellidoPaterno, String ApellidoMaterno, String FechaNacimiento, String RFC, String CURP, String Telefono, String Correo, String Usuario, String Contrasena, Plastico Tarjeta, Domicilio Domicilio) {
        super(Nombre, ApellidoPaterno, ApellidoMaterno, FechaNacimiento, RFC, CURP, Telefono, Correo, Usuario, Contrasena, Tarjeta, Domicilio);
    }





    
}
