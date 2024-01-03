import javax.swing.JOptionPane;
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
            this.Nombre = validarNombre(Nombre);
            this.ApellidoPaterno = validarApellido(ApellidoPaterno);
            this.ApellidoMaterno = validarApellido(ApellidoMaterno);
            this.FechaNacimiento = validarFechaNacimiento(FechaNacimiento);
            this.RFC = validarRFC(RFC);
            this.CURP = validarCURP(CURP);
            this.Telefono = validarTelefono(Telefono);
            this.Correo = validarCorreo(Correo);
            this.Usuario = Usuario;
            this.Contrasena = Contrasena;
        }

        //constructor vacio
        public Personas() {
        }

        // Validación de nombre
        private String validarNombre(String nombre) {
            if (nombre.matches("[a-zA-Z]+")) {
                return nombre;
            } else {
                JOptionPane.showMessageDialog(null, "Nombre inválido", "Error", JOptionPane.ERROR_MESSAGE);
                
            }
        }

        // Validación de apellido
        private String validarApellido(String apellido) {
            if (apellido.matches("[a-zA-Z]+")) {
                return apellido;
            } else {
                JOptionPane.showMessageDialog(null, "Apellido inválido", "Error", JOptionPane.ERROR_MESSAGE);
                
        }
    }

    // Validación de fecha de nacimiento
    private String validarFechaNacimiento(String fechaNacimiento) {
        if (fechaNacimiento.matches("\\d{2}/\\d{2}/\\d{4}")) {
            String[] parts = fechaNacimiento.split("/");
            int dia = Integer.parseInt(parts[0]);
            int mes = Integer.parseInt(parts[1]);
            int ano = Integer.parseInt(parts[2]);
            
            if (ano >= 1980 && ano <= 2024) {
                if (mes >= 1 && mes <= 12) {
                    if (mes == 2) {
                        if (dia >= 1 && dia <= 28) {
                            return fechaNacimiento;
                        } else {
                            JOptionPane.showMessageDialog(null, "Día de nacimiento inválido", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                        if (dia >= 1 && dia <= 30) {
                            return fechaNacimiento;
                        } else {
                            JOptionPane.showMessageDialog(null, "Día de nacimiento inválido", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    } else {
                        if (dia >= 1 && dia <= 31) {
                            return fechaNacimiento;
                        } else {
                            JOptionPane.showMessageDialog(null, "Día de nacimiento inválido", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Mes de nacimiento inválido", "Error", JOptionPane.ERROR_MESSAGE);
                }
                return fechaNacimiento;
            } else {
                JOptionPane.showMessageDialog(null, "Año de nacimiento inválido", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Fecha de nacimiento inválida", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }


    // Validación de RFC
    private String validarRFC(String rfc) {
        if (rfc.length() <= 13) {
            if (rfc.contains(FechaNacimiento)) {
                return rfc;
            } else {
                JOptionPane.showMessageDialog(null, "El RFC debe contener la fecha de nacimiento", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "El RFC debe tener hasta 13 digitos", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }

    // Validación de CURP
    private String validarCURP(String curp) {
        if (curp.length() <= 18) {
            if (curp.contains(FechaNacimiento)) {
                return curp;
            } else {
                JOptionPane.showMessageDialog(null, "La CURP debe contener la fecha de nacimiento", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "La CURP debe tener hasta 18 dígitos", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }

    
// Validación de teléfono
private String validarTelefono(String telefono) {
    if (telefono.length() == 10 && telefono.matches("\\d+")) {
        int num = Integer.parseInt(telefono);
        if (num >= 0) {
            return telefono;
        } else {
            JOptionPane.showMessageDialog(null, "El teléfono no puede ser negativo", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } else {
        JOptionPane.showMessageDialog(null, "El teléfono debe tener 10 dígitos ", "Error", JOptionPane.ERROR_MESSAGE);
    }
    return null;
}

// Validación de correo
private String validarCorreo(String correo) {
    if (correo.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.com")) {
        return correo;
    } else {
        JOptionPane.showMessageDialog(null, "El correo debe tener un formato válido (ejemplo@dominio.com)", "Error", JOptionPane.ERROR_MESSAGE);
    }
    return null;
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