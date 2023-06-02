package TP2;
import java.util.Arrays;

public class Ejercicio4N{
    
    // Método que devuelve la cantidad de elementos en el array
    public static int cantidadElementos(int[] array) {
        return array.length;
    }
    
    // Método que devuelve el valor máximo en el array de enteros
    public static int encontrarMaximo(int[] numeros) {
        int maximo = numeros[0]; // asumimos que el primer elemento es el máximo inicialmente
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maximo) {
                maximo = numeros[i]; // actualizamos el máximo si encontramos un número mayor
            }
        }
        return maximo;
    }
    
    // Método que devuelve el promedio de los elementos en el array
    public static double calcularPromedio(int[] numeros) {
        int sum = 0;
        for (int i = 0; i < numeros.length; i++) {
            sum += numeros[i];
        }
        double promedio = (double) sum / numeros.length;
        return promedio;
    }
    
    // Método que devuelve una cadena de caracteres con los enteros en el array invertidos
    public static String invertirEnteros(int[] numeros) {
        String numerosInvertidos = new StringBuilder(Arrays.toString(numeros))
            .reverse()
            .toString();
        return numerosInvertidos;
    }
    
    public static void main(String[] args) {
        int[] numeros = {4,2,3,8,1};
        System.out.println("Cantidad de Elementos: " + cantidadElementos(numeros)); // Imprime la cantidad de elementos en el array
        System.out.println("El máximo es: " + encontrarMaximo(numeros)); // Imprime el valor máximo en el array
        System.out.println("El promedio es:" + calcularPromedio(numeros)); // Imprime el promedio de los elementos en el array
        Arrays.sort(numeros); // Ordena el array de menor a mayor
        System.out.println(Arrays.toString(numeros)); // Imprime el array ordenado
        System.out.println(invertirEnteros(numeros)); // Imprime los enteros en el array invertidos
    }
} 