package TP2;
import java.util.Arrays;
public class Ejercicio4Enzo {
    public static void main(String[] args) {
        int[] numeros = {4, 2, 3, 8, 1};
        imprimirInformacion(numeros);
    }

    public static void imprimirInformacion(int[] numeros) {
        int cantidad = numeros.length;
        int mayor = numeros[0];
        int suma = 0;
        double promedio;

        for (int i = 0; i < cantidad; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
            suma += numeros[i];
        }
        promedio = (double) suma / cantidad;

        System.out.println("Cantidad de números: " + cantidad);
        System.out.println("Número mayor: " + mayor);
        System.out.println("Promedio: " + promedio);

        Arrays.sort(numeros);
        System.out.println("Números ordenados de menor a mayor: " + Arrays.toString(numeros));

        int[] inverso = new int[cantidad];
        for (int i = 0; i < cantidad; i++) {
            inverso[i] = numeros[cantidad - 1 - i];
        }
        System.out.println("Números ordenados de mayor a menor: " + Arrays.toString(inverso));
    }
}
