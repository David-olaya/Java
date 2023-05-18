import java.util.Arrays;

public class numerar { //esta es la clase 
    
     //este es el metodo el cual es ordenar numeros y manejare tres datos enteros

    public static int[] ordenarNumeros(int numUno, int numDos, int numTres) {
        int[] numeros = {numUno, numDos, numTres};
       
         //el arrays.sort es para almacenar datos los cuales serian los tres numeros que vamos a solicitar

        Arrays.sort(numeros);
        int[] numerosOrdenados = {numeros[2], numeros[1], numeros[0]};
        return numerosOrdenados;
    }
    
}