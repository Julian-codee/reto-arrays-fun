import java.util.Arrays;

public class TallerArreglos {
    public static void main(String[] args) {
        // 1. Declaración e inicialización de un arreglo
        int[] numeros = {5, 2, 8, 1, 9, 3, 7, 4, 6};

        // 2. Imprimir el arreglo original
        System.out.println("Arreglo original:");
        imprimirArreglo(numeros);

        // 3. Encontrar el número mayor

        int mayor = encontrarMayor(numeros);
        System.out.println("El número mayor es: " + mayor);

        // 4. Calcular el promedio
        double promedio = calcularPromedio(numeros);
        System.out.println("El promedio es: " + promedio);

        // 5. Invertir el arreglo
        invertirArreglo(numeros);
        System.out.println("Arreglo invertido: ");
        imprimirArreglo(numeros);

        // 6. Ordenar el arreglo (implementa el método ordenarArreglo)
        ordenarArreglo(numeros);
        System.out.println("Arreglo ordenado:");
        imprimirArreglo(numeros);
    }

    //METODOS DE FUNCIONALIDAD

    // Método para imprimir el arreglo
    public static void imprimirArreglo(int[] numeros ) {
        for (int num : numeros) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Método para encontrar el número mayor
    public static int encontrarMayor(int[] numeros) {
     int numeroMayor = numeros[0];
     for(int i = 1; i < numeros.length; i++){
         if (numeros[i] > numeroMayor){
             numeroMayor = numeros[i];
         }
     }
        return numeroMayor;
    }

    // Método para calcular el promedio
    public static double calcularPromedio(int[] numeros) {
        double total = 0;
        for (int i = 0; i < numeros.length; i++){
            total += numeros[i];
        }
        double totalFinal = total / numeros.length;
        return totalFinal;
    }


    // Método para invertir el arreglo
    public static void invertirArreglo(int[] numeros) {
        int invertido[] = new int[numeros.length];
        for (int i = invertido.length - 1, j = 0; i >= 0; i--, j++){
            invertido[i] = numeros[j];

        }
        for (int i = 0; i < invertido.length; i ++){
            System.out.print(invertido[i] +" ");
        }
    }

    // Método para ordenar el arreglo (puedes usar el algoritmo de burbuja)
    public static void ordenarArreglo(int[] numeros) {
        Arrays.sort(numeros);;
    }
}