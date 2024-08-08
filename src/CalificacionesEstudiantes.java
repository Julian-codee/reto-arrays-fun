

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
        for (int i = 0 ; i < estudiantes.length; i++) {
            System.out.print(estudiantes[i] + " : \n ");

            for (int j = 0 ; j < materias.length; j++) {
                System.out.print(materias[j] + " = " + notas[i][j] + "\n");


            }
            System.out.println();
        }
        System.out.println();



    }

    //Mostrar el Promedio de los estudiantes

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
        System.out.println();
    }

//Mostrar el mejor estudiante

    public static void encontrarMejorEstudiante(String[] estudiantes, double[][] notas) {

        System.out.print("El mejor promedio es: ");
        double mejorEstudiante2[] = new double[estudiantes.length];
        for (int i = 0; i < notas.length; i++){
            double total = 0;
            for (int j = 0; j < notas.length; j++){
                total += notas[i][j];
            }
            double totalFinal = total / notas.length;
            mejorEstudiante2[i] = totalFinal;

        }
        double max = mejorEstudiante2[0];
        for(int i = 1; i < mejorEstudiante2.length; i++) {
            if (mejorEstudiante2[i] > max) {
                max = mejorEstudiante2[i];
                System.out.print(estudiantes[i] + " con un promedio de " + max);
            }
        }
        System.out.println();
    }

    //Mostrar la mejor materia

    public static void encontrarMejorMateria(String[] materias, double[][] notas) {
        double mejorMateria2[] = new double[materias.length];
        for (int i = 0; i < notas.length; i++){
            double total = 0;
            for (int j = 0; j < notas.length; j++){
                total += notas[j][i];
            }
             mejorMateria2[i] = total / notas.length;


        }
        double max = mejorMateria2[0];
        int indice = 0;
        for(int i = 1; i < mejorMateria2.length; i++) {
            if (mejorMateria2[i] > max) {
                max = mejorMateria2[i];
                indice = i;

            }
        }
        System.out.println("La materia es: " + materias[indice] + " con un promedio de " + max);
    }
}




