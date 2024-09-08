
package algoritmo;

public class NotacionBigO {


    public static void main(String[] args) {
        String[] nombres = {"Jorge",
                            "Chicana",
                            "Aspajo",
                            "Katherine",
                            "Joyce",
                            "Arleth",
                            "Monica"};
        
        //El tiempo de ejecucion es proporcional al tamaño de la entrada
        for(int i=0; i<nombres.length;i++){
            System.out.println(nombres[i]);//accede a cada elemento
        }
    }
    
}
