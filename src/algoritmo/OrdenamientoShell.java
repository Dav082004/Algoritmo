package algoritmo;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class OrdenamientoShell {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arreglo[], nElementos;
        
        // Solicitar al usuario el número de elementos del arreglo
        nElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite el número de elementos del arreglo: "));
        
        // Inicializar el arreglo con el tamaño indicado por el usuario
        arreglo = new int[nElementos];
        
        // Pedir al usuario que ingrese cada uno de los elementos del arreglo
        System.out.println("Digite el arreglo: ");
        for(int i = 0; i < nElementos; i++) {
            System.out.println((i + 1) + ". Digite un número: ");
            arreglo[i] = sc.nextInt();  // Guardar cada número en el arreglo
        }
        
        // Llamar a la función shellSort para ordenar el arreglo
        shellSort(arreglo, nElementos);
        
        // Imprimir el arreglo ya ordenado en orden ascendente
        System.out.print("\nOrden Ascendente Final: ");
        for(int i = 0; i < nElementos; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println(); // Saltar a una nueva línea al final
    }
    
    // Función que implementa el algoritmo de Ordenamiento Shell
    public static void shellSort(int[] arreglo, int n) {
        // El gap inicial será la mitad del tamaño del arreglo
        int gap = n / 2;
        
        // Continuar reduciendo el gap hasta que sea 0
        while(gap > 0) {
            // Recorrer los elementos desde el gap hasta el final del arreglo
            for(int i = gap; i < n; i++) {
                // Guardar el elemento actual y su posición
                int temp = arreglo[i];
                int j = i;
                
                // Mover los elementos del arreglo que estén a más de gap posiciones
                // y que sean mayores que el elemento temporal
                while(j >= gap && arreglo[j - gap] > temp) {
                    arreglo[j] = arreglo[j - gap]; // Desplazar el elemento hacia adelante
                    j -= gap; // Moverse hacia atrás en el arreglo en intervalos de gap
                }
                
                // Colocar el elemento temporal en su posición correcta
                arreglo[j] = temp;
                
                // Imprimir el estado actual del arreglo después de cada inserción
                System.out.print("Después de mover gap=" + gap + ": ");
                for(int k = 0; k < n; k++) {
                    System.out.print(arreglo[k] + " ");
                }
                System.out.println(); // Saltar a una nueva línea para la siguiente iteración
            }
            // Reducir el gap para la siguiente fase
            gap /= 2;
        }
    }
}
