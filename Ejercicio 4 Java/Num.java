import java.util.Scanner;

public class Num {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
       //variables
        int suma = 0;
        int contador = 0;
        double promedio = 0;

        
        System.out.println("Ingrese números para ser promediados (ingrese 0 para terminar)");

        int numero;
       
        //la variable numero la usare para almacenar los números ingresados 
        do {
            numero = scanner.nextInt();
            suma += numero;
            contador++;
        } while (numero != 0);

        //Este es un bucle que se ejecuta repetidamente hasta que la persona ingrese 0
        if (contador > 1) {
            promedio = (double) suma / (contador - 1);
            System.out.println("La suma de los números ingresados es: " + suma);
            System.out.println("El promedio de los números ingresados es: " + promedio);
        } else {
            System.out.println("No se ingresaron números suficientes para calcular el promedio.");
        }

    }
}