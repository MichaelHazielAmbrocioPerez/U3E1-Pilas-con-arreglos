package U3E1;

import java.util.Scanner;

public class Pila {
    
    int vectorPila[] = new int [10];
    int cima = -1;
    
    Scanner leer = new Scanner(System.in);
    
    public void Insertar(){
        if (cima >= vectorPila.length-1) {
            System.out.println("Ya no caben");
        }else{
            cima += 1;
            System.out.println("Ingrese su dato");
            vectorPila[cima] = leer.nextInt();  
        }
}
    public void Eliminar(){
    if (cima == -1) {
        System.out.println("La pila está vacia");
    } else {
        System.out.println("Borrado");
        vectorPila[cima] = 0;
        cima --;
    }
}
    public void Mostrar(){
        if (cima == -1) {
            System.out.println("Esta vacio");
        }else{
        for (int cima = 9; cima >=0; cima--) {
            System.out.println("valor de la pila = "+vectorPila[cima]);
            
        }
        }
    }    
}
