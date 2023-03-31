import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //llamar a mi clase
        max maxHeap = new max();
        Scanner leer = new Scanner(System.in);
        int valor = 0;

        for (int i = 0; i < 15; i++) {
            System.out.println("Ingrese valor \n");
            valor = leer.nextInt();
            maxHeap.insertar(valor); //llamando insertacion de valores en el arbol
        }

        //imprimiendo orden
        maxHeap.imprimir();
    }
}