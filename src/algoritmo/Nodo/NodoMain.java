package algoritmo.Nodo;

public class NodoMain {

    public static void main(String[] args) {
        String persona1="Hola1";
        String persona2="Hola2";
        String persona3="Hola3";
        String persona4="Hola4";
        
        Nodo n1 = new Nodo(persona1);
        Nodo n2 = new Nodo(persona2);
        Nodo n3 = new Nodo(persona3);
        Nodo n4 = new Nodo(persona4);
        
        n1.setSiguiente(n2);
        n2.setSiguiente(n3);
        n3.setSiguiente(n4);
        
            Nodo aux = n1;
            
            for(int i=0;i<4;i++){
                
                String aux2=(String)aux.getContiene();
                System.out.println(aux2);
                aux = aux.getSiguiente();
            }
    }
}
