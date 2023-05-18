import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class FechaNacimiento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su fecha de nacimiento de la siguiente forma con el signo -  (año-Mes-Dia):");
        String fechaNacimientoStr = scanner.nextLine();

        
        FechaZodiaco fechaZodiaco = new FechaZodiaco(fechaNacimientoStr);

        // Obtener el signo zodiacal 
        String signoZodiacal = fechaZodiaco.obtenerSignoZodiacal();

        // Calcular la edad actual
        int edad = calcularEdad(fechaZodiaco);

        System.out.println("Su signo zodiacal es: " + signoZodiacal);
        System.out.println("Su edad actual es: " + edad + " años.");

        scanner.close();
    }
   
         // Método para calcular la edad actual
    public static int calcularEdad(FechaZodiaco fechaZodiaco) {
        
        // Obtener la fecha actual
        LocalDate fechaActual = LocalDate.now();
        
        LocalDate fechaNacimiento = LocalDate.of(fechaZodiaco.year, fechaZodiaco.mes, fechaZodiaco.dia);
        
        // diferencia entre la fecha de nacimiento y la fecha actual
         Period periodo = Period.between(fechaNacimiento, fechaActual);
        
        // Obtener la edad en años
        return periodo.getYears();
    }
}