package algoritmo;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class OrdenamientoInserccion {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arreglo[],nElementos;
        
        nElementos=Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de elementos del arreglo: "));
        
        arreglo = new int [nElementos];
        
        System.out.println("Digite el arreglo: ");
        for(int i=0; i<nElementos;i++){
            System.out.println((i+1)+". Digite un numero: ");
            arreglo[i]= sc.nextInt();
        }
        
        //Ordenamiento por Inserccion
        
        for(int i=0;i<nElementos;i++){
            int pos = i;
            int aux = arreglo[i];
            
            while((pos > 0) && (arreglo [pos-1] > aux)){
                arreglo[pos] = arreglo[pos-1];
                pos--;
            }
            arreglo[pos]=aux;
        }
        System.out.print("\nOrden Ascendente: ");
        for(int i=0;i<nElementos;i++){
            System.out.print(arreglo[i]+" - ");
        }
        System.out.println("");
    
    }
}
