import java.util.ArrayList;
import java.util.Scanner;

public class Curso {
    private ArrayList<Estudiantes> listaEstudiantes;
    private static int contadorCodigos = 1; // empieza desde 1

    public Curso() {
        listaEstudiantes = new ArrayList<>();
    }

    // Método para generar un código automáticamente en formato "000001"
    private String generarCodigoAutomatico() {
        return String.format("%06d", contadorCodigos++);
    }

    // Método para añadir un estudiante al curso
    public void anadirEstudiante() {
        Scanner scanner = new Scanner(System.in);
        Estudiantes nuevo = new Estudiantes();

        System.out.print("Ingrese el nombre del estudiante: ");
        nuevo.setNombre(scanner.nextLine());

        System.out.print("Ingrese el apellido del estudiante: ");
        nuevo.setApellido(scanner.nextLine());

        System.out.print("Ingrese el número de semestre: ");
        nuevo.setNumeroDeSemanstre(scanner.nextInt());

        System.out.print("Ingrese la nota final: ");
        nuevo.setNotaFinal(scanner.nextDouble());

        // Asignación de código automático
        String codigoGenerado = generarCodigoAutomatico();
        nuevo.setCodigo(Integer.parseInt(codigoGenerado)); // se guarda como int en el objeto

        // Validamos que el código no exista ya en la lista (aunque en este caso es improbable)
        for (Estudiantes e : listaEstudiantes) {
            if (e.getCodigo() == nuevo.getCodigo()) {
                System.out.println("¡Error! Código duplicado.");
                return;
            }
        }

        listaEstudiantes.add(nuevo);
        System.out.println("Estudiante añadido exitosamente con código: " + codigoGenerado);
    }
}
