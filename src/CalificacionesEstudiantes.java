

public class CalificacionesEstudiantes {
    public static void main(String[] args){
        // Definimos los datos de los estudiantes
        String[] estudiantes = {"Ana", "Carlos", "Sofía", "David", "Elena"};
        String[] materias = {"Matemáticas", "Física", "Química", "Literatura", "Historia"};
        double[][] notas = {
                {8.5, 7.0, 9.0, 8.0, 7.5},  // Notas de Ana
                {7.0, 6.5, 8.0, 9.0, 8.5},  // Notas de Carlos
                {9.5, 9.0, 9.5, 8.5, 9.0},  // Notas de Sofía
                {6.0, 7.0, 7.5, 8.0, 7.0},  // Notas de David
                {8.0, 8.5, 7.5, 9.0, 8.5}   // Notas de Elena
        };

        // Mostramos la información de los estudiantes
        mostrarInformacionEstudiantes(estudiantes, materias, notas);

        // Calculamos y mostramos los promedios de cada estudiante
        calcularPromedios(estudiantes, notas);

        // Encontramos y mostramos al estudiante con el promedio más alto
        encontrarMejorEstudiante(estudiantes, notas);

        // Encontramos y mostramos la materia con el promedio más alto
        encontrarMejorMateria(materias, notas);
    }

    //Mostrar la Informacion de los Estudiantes

    public static void mostrarInformacionEstudiantes(String[] estudiantes, String[] materias, double[][] notas) {
        System.out.println("Información de los estudiantes:");
        for (String estudiante : estudiantes) {
            System.out.print(estudiante + " , ");

        }

        System.out.println();

        for (int i = 0; i < notas.length; i++){
            for (int j = 0; j < notas[i].length; j++){
                System.out.print(notas[i][j] +   " ");
            }

            for (String materia : materias) {
                System.out.print(materia + ", ");

            }
            System.out.println();
        }

    }

    public static void calcularPromedios(String[] estudiantes, double[][] notas) {
        System.out.println("\nPromedios de los estudiantes:");



        for (int i = 0; i < notas.length; i++){
            double total = 0;
            for (int j = 0; j < notas.length; j++){
                total += notas[i][j];
            }
            double totalFinal = total / notas.length;
            System.out.print(estudiantes[i] +  " = " + totalFinal );
            System.out.println();
        }

    }

    public static void encontrarMejorEstudiante(String[] estudiantes, double[][] notas) {

    }

    public static void encontrarMejorMateria(String[] materias, double[][] notas) {
        // Implementa este método
    }
}

