
import java.util.InputMismatchException;
import java.util.Scanner;


public class Practica_1 {
    public static void main(String args[]){ 
    Scanner leerC = new Scanner(System.in);
     
    //Declarar variables
     float notaE1;
     float notaE2;
     float notaE3;
     float promedio;
     String nombreE1;
     String nombreE2;
     String nombreE3;
    
    System.out.println("Informacion Estudiantes");
    
    System.out.print("Nombre: ");
    
    try{
    
    nombreE1 = leerC.next();
    nombreE2 = leerC.next();
    nombreE3 = leerC.next();
    
    
    System.out.println("Nota: ");
    
    notaE1 = leerC.nextFloat();
    notaE2 = leerC.nextFloat();
    notaE3 = leerC.nextFloat();
    
    promedio = (+ notaE1 + +notaE2 + notaE3 )/ 3;
    
    System.out.println("El estudiante" + nombreE1 + "obtuvo una nota de " + notaE1);
    
    System.out.println("El estudiante" + nombreE2 + "obtuvo una nota de " + notaE2);
    
    System.out.println("El estudiante" + nombreE3 + "obtuvo una nota de " + notaE3);
    
    System.out.println("El promedio es " +  promedio);
    
    } catch (InputMismatchException ex) {
      
    System.out.println("Por favor, Ingrese un valor Numerico"); 
   }
  }
}
      
    
    
    
 

