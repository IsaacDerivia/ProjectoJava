package proyecto;

import javax.swing.JOptionPane;


public class Personas {
    //atributos de una persona
    private String Nombre;
    private String ApellidoPaterno;
    private String ApellidoMaterno;
    private String FechaNacimiento;
    private String RFC;
    private String CURP;
    private String Telefono;
    private String Correo;
    private String Usuario;
    private String Contrasena;


        //constructores
        public Personas(String Nombre, String ApellidoPaterno, String ApellidoMaterno, String FechaNacimiento, String RFC, String CURP, String Telefono, String Correo, String Usuario, String Contrasena) {
            this.Nombre = Nombre;
            this.ApellidoPaterno = ApellidoPaterno;
            this.ApellidoMaterno = ApellidoMaterno;
            this.FechaNacimiento = FechaNacimiento;
            this.RFC = RFC;
            this.CURP = CURP;
            this.Telefono = Telefono;
            this.Correo = Correo;
            this.Usuario = Usuario;
            this.Contrasena = Contrasena;
        }

        //constructor vacio
        public Personas() {
        }


public String getNombre() {
    return Nombre;
}

public void setNombre(String nombre) {
    Nombre = nombre;
}

public String getApellidoPaterno() {
    return ApellidoPaterno;
}

public void setApellidoPaterno(String apellidoPaterno) {
    ApellidoPaterno = apellidoPaterno;
}

public String getApellidoMaterno() {
    return ApellidoMaterno;
}

public void setApellidoMaterno(String apellidoMaterno) {
    ApellidoMaterno = apellidoMaterno;
}

public String getFechaNacimiento() {
    return FechaNacimiento;
}

public void setFechaNacimiento(String fechaNacimiento) {
    FechaNacimiento = fechaNacimiento;
}

public String getRFC() {
    return RFC;
}

public void setRFC(String rFC) {
    RFC = rFC;
}

public String getCURP() {
    return CURP;
}

public void setCURP(String cURP) {
    CURP = cURP;
}

public String getTelefono() {
    return Telefono;
}

public void setTelefono(String telefono) {
    Telefono = telefono;
}

public String getCorreo() {
    return Correo;
}

public void setCorreo(String correo) {
    Correo = correo;
}

public String getUsuario() {
    return Usuario;
}

public void setUsuario(String usuario) {
    Usuario = usuario;
}

public String getContrasena() {
    return Contrasena;
}

public void setContrasena(String contrasena) {
    Contrasena = contrasena;
}











}