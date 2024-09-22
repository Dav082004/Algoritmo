package algoritmo;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class OrdenamientoInserccion {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arreglo[],nElementos;
        
        
        // Solicitar al usuario el número de elementos del arreglo
        nElementos=Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de elementos del arreglo: "));
        
        // Inicializar el arreglo con el tamaño indicado por el usuario
        arreglo = new int [nElementos];
        
        // Pedir al usuario que ingrese cada uno de los elementos del arreglo
        System.out.println("Digite el arreglo: ");
        for(int i=0; i<nElementos;i++){
            System.out.println((i+1)+". Digite un numero: ");
            arreglo[i]= sc.nextInt(); // Guardar cada número en el arreglo
        }
        
        //Ordenamiento por Inserccion
        
        // Implementación del algoritmo de Ordenamiento por Inserción
        for(int i=0;i<nElementos;i++){
            int pos = i;            // Guardar la posición actual del elemento
            int aux = arreglo[i];   // Guardar el valor actual del elemento
            
            // Desplazar elementos mayores hacia la derecha para hacer espacio
            while((pos > 0) && (arreglo [pos-1] > aux)){
                arreglo[pos] = arreglo[pos-1];  // Desplazar el elemento hacia la derecha
                pos--;  // Mover la posición de inserción hacia la izquierda
            }
            // Insertar el elemento en su posición correcta
            arreglo[pos]=aux;
        }
        
        // Imprimir el arreglo ya ordenado en orden ascendente
        System.out.print("\nOrden Ascendente: ");
        for(int i=0;i<nElementos;i++){
            System.out.print(arreglo[i]+" - ");
        }
        System.out.println(""); // Saltar a una nueva línea al final
    
    }
}
