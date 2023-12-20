package proyecto;

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
}
