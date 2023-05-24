import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

    Scanner leer = new Scanner(System.in);

    /*int cantHermanos = 0;
    

    System.out.println("Ingrese la cantidad de hermanos que tiene ");
    cantHermanos = leer.nextInt();

    String[] nombres = new String[cantHermanos];

    for (int i = 0; i < cantHermanos; i++) {
        System.out.print("Ingrese el nombre del hermano # " + (i+1) + ":");
        nombres[i] = leer.next();
        
    }

    System.out.println("Usted tiene " + cantHermanos + "hermanos, sus nombre son: ");

    for (int i = 0; i < cantHermanos; i++) {
        System.out.println((i+1) + ". " + nombres[i]);
        
    }*/
        
    /*crear programa en el cual el usuario indique cuantos campos va a tener el arreglo de números enteros,el usuario debe ingresar cada uno de esos campos, incluyendo num positivos, negativos y ceros, al final debe decir cuantos números de cada tipo ingresaron */

    
    int nElementos;
    int positivos = 0;
    int negativos = 0;
    int ceros = 0;

    System.out.println("Ingrese el numero de datos que va a registrar ");
    nElementos = leer.nextInt();

    int[] numeros = new int[nElementos];

    for (int i = 0; i < nElementos; i++) {
        System.out.println("Ingrese el numero " + (i+1) + ":");
        numeros[i] = leer.nextInt();
        
    }

    for (int i = 0; i < nElementos; i++) {
        if (numeros[i] > 0) {
            positivos++;

        }else if (numeros[i] < 0){
            negativos++;

        }else{
            ceros++;
        }
        
    }

    System.out.println("Numeros postivos: " + positivos);
    System.out.println("Numeros negativos: " + negativos);
    System.out.println("Ceros: " + ceros);

    }
}
