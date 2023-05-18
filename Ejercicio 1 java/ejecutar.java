import java.util.Scanner;

public class ejecutar { //esta es la clase principal para ejecutar el programa

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Aca se crean los objetos de la clase libro
        Libro libro1 = new Libro();
        Libro libro2 = new Libro();
        
        //información del primer libro y lo que se le pedira ingresar al usuario
        System.out.println("Ingrese el autor del primer libro:");
        libro1.setAutor1(scanner.nextLine());
        
        System.out.println("Ingrese el título del primer libro:");
        libro1.setTitulo1(scanner.nextLine());
        
        System.out.println("Ingrese el número de páginas del primer libro:");
        libro1.setPaginas1(scanner.nextInt());
        
        scanner.nextLine(); 
        
        //  información del segundo libro y lo que se le pedira ingresar al usuario
        System.out.println("Ingrese el autor del segundo libro:");
        libro2.setAutor2(scanner.nextLine());
       
        System.out.println("Ingrese el título del segundo libro:");
        libro2.setTitulo2(scanner.nextLine());
       
        System.out.println("Ingrese el número de páginas del segundo libro:");
        libro2.setPaginas2(scanner.nextInt());
       
        scanner.nextLine(); 
           
        libro1.informacionLibro();
        libro2.informacionLibro();
        
         // Aca se realiza la comparativa de los dos libros por sus paginas
        Libro.compararLibros(libro1, libro2);
    }

}