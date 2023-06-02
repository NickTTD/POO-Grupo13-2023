package TP2;

import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese un valor para Entero: ");
            long valor = scanner.nextLong();
            Entero e = new Entero(valor);
            System.out.println("El numero ingresado es: "+e.getNumero());
            System.out.println("El cuadrado de " + e.getNumero() + " es: " + e.cuadrado());
            System.out.println(e.par());
            System.out.println("Su factorial es: " + e.factorial());
            if (e.esPrimo()) {
                System.out.println("Es primo");
            } else {
                System.out.println("no es primo");
            }
        }
        }}
         

