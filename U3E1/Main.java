package U3E1;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
    int opc;
    
    Pila pila = new Pila();
    Scanner leer = new Scanner(System.in);

    do{
    System.out.println("[1]Insertar");
    System.out.println("[2]Eliminar");
    System.out.println("[3]Mostrar");
    System.out.println("[4]Salir");
    
    opc = leer.nextInt();
    
    switch(opc){
    
        case 1:
            pila.Insertar();
        break;
        
        case 2:
            pila.Eliminar();
        break;
        
        case 3:
            pila.Mostrar();
        break;
        
        case 4:
            System.out.println("Chau");
        break;
        
        default:
            System.out.println("Opción incorrecta");
        break;    
    }
    }while(opc!= 4);
    }
}
