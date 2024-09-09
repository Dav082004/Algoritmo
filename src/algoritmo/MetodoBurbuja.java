
package algoritmo;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class MetodoBurbuja {

    public static void main(String[] args) {
        
        //Funciona revisando,cada elemento de la lista
        //que va a ser ordenada con el siguiente,
        //intercambiandolos de posicion si estan en el orden equivocado.
        //Es necesario revisar varias veces toda la lista hasta que no se necesiten
        //mas intercambios,significando el ordamiento.
        
        Scanner entrada= new Scanner (System.in);
        int arreglo[],nElementos,aux;
        
        nElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de elementos del arreglo"));
        
        arreglo=new int [nElementos]; //Le asignamos el numero de elementos al arreglo
        
        for(int i=0;i<nElementos;i++){
            System.out.print((i+1)+". Digite un numero: ");
            arreglo[i]=entrada.nextInt();
            
        }
        
        //Metodo Burbuja
        //Primer for para saber cuantas vueltas tiene que dar
        for(int i=0;i<(nElementos-1);i++){
            //Segundo for para ordenar el arreglo tomando en cuenta el condicional
            for(int j=0;j<(nElementos-1);j++){
                if(arreglo[j] > arreglo[j+1]){//Si numeroActual > numeroSiguiente
                    aux = arreglo[j];
                    arreglo[j]=arreglo[j+1];
                    arreglo[j+1]=aux;
                }
            }
        }
        
        //Mostrando el arreglo ordenado en forma creciente
        System.out.print("\nArreglo ordenado en forma creciente: ");
        for(int i=0;i<nElementos;i++){
            System.out.print(arreglo[i]+" - ");
        }
        
        System.out.println("\n Arreglo ordenado en forma decreciente");
        for(int i=(nElementos-1);i>=0;i--){
            System.out.print(arreglo[i]+" - ");
        }
        System.out.println("");
    }
}
