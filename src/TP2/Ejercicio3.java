package TP2;
import java.util.Scanner;

public class Ejercicio3 {
        public static void main(String[] args) {
            try (Scanner sc = new Scanner(System.in)) {      //El try de esta linea lo agrego vs code porque detectó un leak
                System.out.print("Ingrese una palabra: ");
                String palabra = sc.nextLine().toLowerCase();
   
                String reverso = new StringBuilder(palabra).reverse().toString();
                if (palabra.equals(reverso)) {
                    System.out.println(palabra + " es un palíndromo");
                } else {
                    System.out.println(palabra + " no es un palíndromo");
                }
            }
        }
    }
