
package algoritmo;

public class NotacionBigOCuadratica {


    public static void main(String[] args) {
        String[] nombres = {"Jorge",
                            "Chicana",
                            "Aspajo",
                            "Katherine",
                            "Joyce",
                            "Arleth",
                            "Monica"};
        
        //Con estructuras anidadas dobles, el tiempo de ejecucion esta definido por:n*n
        int n = nombres.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.println(nombres[i]);//accede a cada elemento
            }
        }
    }
    
}
