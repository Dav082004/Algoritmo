package algoritmo;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class OrdenamientoporSeleccion1 {

    public static void main(String[] args) {
        
        //Es un algoritmo de ordenamiento que requiere algunas
        //operaciones para ordenar una lista de n numeros.
        //Su funcionamiento es el siguiente:
        
        //1.Buscar el menor elemento
        //2.Intercambiar con el primer elemento
        //3. Buscar el minimo del resto de los elementos.
        //4.Intercambiar con el segundo
        //5.Y asi sucesivamente
        
        Scanner sc = new Scanner(System.in);
        int arreglo[];
        int nElementos;
        
        nElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de elementos que desea: "));
        arreglo= new int[nElementos];
        
        for(int i=0;i<nElementos;i++){
            System.out.print("Digite un elemento en la posicion ["+i+"] : ");
            arreglo[i]=sc.nextInt();
        }
        
        System.out.println("\nEl arreglo desordenado es: ");
        for(int i = 0;i < nElementos;i++){
            System.out.println(arreglo[i]+" ");
        }
        
        System.out.println("");
        
        //Metodo de seleccion
        int minimo;
        int auxiliar;
        
        
        //Primer for para recorrer los elementos
        for(int i=0;i<nElementos;i++){
            minimo=i; // 
            for(int j=i+i ; j<nElementos ; j++){
                if(arreglo[j] < arreglo[minimo]){
                    minimo=j;
                }
            }
            
            auxiliar = arreglo[i];
            arreglo[i]=arreglo[minimo];
            arreglo[minimo]=auxiliar;
        }
        
        //Imprimir el arreglo
        System.out.println("El arreglo ordenado es: ");
        for(int i =0;i<nElementos;i++){
            System.out.println(arreglo[i]+" ");
        }
    }
}
