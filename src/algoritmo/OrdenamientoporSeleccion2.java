package algoritmo;

// Importamos la librería Scanner para la entrada de datos
import java.util.Scanner;

public class OrdenamientoporSeleccion2 {

    // Método principal
    public static void main(String[] args) {
        // Creamos un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedimos el tamaño del arreglo
        System.out.print("Introduce la longitud del arreglo: ");
        int n = scanner.nextInt();

        // Creamos el arreglo de enteros con el tamaño proporcionado
        int[] arr = new int[n];

        // Llenamos el arreglo con los valores que el usuario ingrese
        System.out.println("Introduce los elementos del arreglo:");
        for (int i = 0; i < n; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        // Mostramos el arreglo antes de ordenarlo
        System.out.println("\nArreglo antes de ser ordenado:");
        imprimirArreglo(arr);

        // Llamamos al método de ordenamiento por selección
        seleccionSort(arr);

        // Mostramos el arreglo después de ser ordenado
        System.out.println("\nArreglo después de ser ordenado:");
        imprimirArreglo(arr);
    }

    // Método que implementa el algoritmo de ordenamiento por selección
    public static void seleccionSort(int[] arr) {
        int n = arr.length; // Tamaño del arreglo

        // Recorremos el arreglo
        
        // Este ciclo recorre todas las posiciones del arreglo excepto la última
        // (no es necesario comparar el último elemento).
        // En cada iteración, 'i' indica la posición actual donde se colocará el
        // siguiente valor mínimo encontrado en el resto del arreglo.
        
        for (int i = 0; i < n - 1; i++) {
            
            // Suponemos que el primer elemento no ordenado es el mínimo
            int indiceMinimo = i;

            // Recorremos el resto del arreglo para encontrar el mínimo
            
            // Este ciclo busca el elemento más pequeño en la parte no ordenada del arreglo.
            // Comienza desde 'i + 1' (el siguiente al actual) hasta el final del arreglo.
            // Si encontramos un elemento menor al actual mínimo, actualizamos el índice del mínimo.
            
            for (int j = i + 1; j < n; j++) {
                // Si encontramos un elemento menor, actualizamos el índice del mínimo
                if (arr[j] < arr[indiceMinimo]) {
                    indiceMinimo = j;
                }
            }

            // Si el índice mínimo ha cambiado, intercambiamos los valores
            if (indiceMinimo != i) {
                // Intercambiamos el valor en la posición actual con el valor mínimo encontrado
                int temp = arr[i];
                arr[i] = arr[indiceMinimo];
                arr[indiceMinimo] = temp;
            }

            // Mostramos el estado del arreglo después de cada iteración del ciclo externo
            System.out.print("\nIteracion " + (i + 1) + ": ");
            imprimirArreglo(arr);
        }
    }

    // Método para imprimir el contenido del arreglo
    public static void imprimirArreglo(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println(); // Salto de línea
    }
}
