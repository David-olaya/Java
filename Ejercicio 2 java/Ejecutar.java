import java.util.Scanner;

public class Ejecutar { //esta es la clase principal
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer número: "); //esta parte imprime el mensaje solicitando que ingrese el primer numero
        
        int numeroUno = scanner.nextInt(); //Esta línea lee el número entero y lo almacena en la variable numero uno dos y tres
       
        System.out.print("Ingrese el segundo número: ");//esta parte imprime el mensaje solicitando que ingrese el segundo numero
        
        int numeroDos = scanner.nextInt();
        
        System.out.print("Ingrese el tercer número: ");//esta parte imprime el mensaje solicitando que ingrese el tercer numero
        
        int numeroTres = scanner.nextInt();
       
        int[] numerosOrdenados = numerar.ordenarNumeros(numeroUno, numeroDos, numeroTres);
        
        System.out.println("Los números ordenados de mayor a menor son: " + numerosOrdenados[0] + ", " + numerosOrdenados[1] + ", " + numerosOrdenados[2]);
    }
    
}
