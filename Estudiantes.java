    //TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
    // click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
    public class Estudiantes {
                private String nombre;
                private String apellido;
                private int codigo;
                private int numeroDeSemanstre;
                private Double notaFinal;
        
                // Getters y Setter de Nombre
                public String getNombre() {
                    return nombre;
                }
        
                public void setNombre(String nombre) {
                    this.nombre = nombre;
                }
        
                // Getter y Setter de Apellido
                public String getApellido() {
                    return apellido;
                }
        
                public void setApellido(String apellido) {
                    this.apellido = apellido;
                }
        
                // Getters y Seters de Codigo
                public int getCodigo() {
                    return codigo;
                }
                public void setCodigo(int codigo) {
                    this.codigo = codigo;
                }
        
                // Getters y Seters de Numero de Semenstre
                public int getNumeroDeSemanstre() {
                    return numeroDeSemanstre;
                }
                public void setNumeroDeSemanstre(int numeroDeSemanstre) {
                    this.numeroDeSemanstre = numeroDeSemanstre;
                }
        
                // Getters y Setters de Nota Final
                public Double getNotaFinal() {
                    return notaFinal;
                }
                public void setNotaFinal(Double notaFinal) {
                    this.notaFinal = notaFinal;
                }
    }