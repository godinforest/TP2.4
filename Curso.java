import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Curso {

    // atributos
    private List<String> estudiantes = new ArrayList<>();

    // getters pooper
    public List<String> getEstudiantes() {
        return estudiantes;
    }

    // setters
    public void setEstudiantes(List<String> estudiantes) {
        this.estudiantes = estudiantes;
    }


    public void addToCourse() {
		//método vacío por ahora
    }

    public void deleteUser() {
        //método vacío por ahora
    }

    public void aproboElCurso() {
        //método vacío por ahora
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Estudiantes estudiante = new Estudiantes();

        // Input del usuario
        System.out.print("Ingrese el nombre del estudiante: ");
        estudiante.setNombre(scanner.nextLine());

        System.out.print("Ingrese el apellido del estudiante: ");
        estudiante.setApellido(scanner.nextLine());

        System.out.print("Ingrese el código del estudiante: ");
        estudiante.setCodigo(scanner.nextInt());

        System.out.print("Ingrese el número de semestre: ");
        estudiante.setNumeroDeSemanstre(scanner.nextInt());

        System.out.print("Ingrese la nota final del estudiante: ");
        estudiante.setNotaFinal(scanner.nextDouble());

        // Mostrar datos ingresados
        System.out.println("\nDatos del estudiante ingresado:");
        System.out.println("Nombre: " + estudiante.getNombre());
        System.out.println("Apellido: " + estudiante.getApellido());
        System.out.println("Código: " + estudiante.getCodigo());
        System.out.println("Semestre: " + estudiante.getNumeroDeSemanstre());
        System.out.println("Nota final: " + estudiante.getNotaFinal());

        scanner.close();
    }
}







