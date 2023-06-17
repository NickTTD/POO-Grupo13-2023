package TP6;

import java.util.Scanner;

public class Bicicleta implements ImpactoEcologico{
    private String fabricante;
    private String rodado;
    private double cantidadKM;

    public double obtenerImpactoEcologico() {
        Scanner scanner = new Scanner(System.in);
		
        System.out.println("Ingresa el fabricante de la bicicleta:");
        fabricante = scanner.nextLine();

        System.out.println("Ingresa el rodado de la bicicleta:");
        rodado = scanner.nextLine();
        
        System.out.println("Ingresa la cantidad de KM recorridos en bici: " + fabricante + " " + rodado );
		cantidadKM = scanner.nextDouble();
		

        double emisionesManufacturaKG = 500;
        double impactoTotal = (cantidadKM * 0.02) + emisionesManufacturaKG;
        
        return impactoTotal;
    }//0.02 = emisiones de CO2 en KG por KM promedio del humano que maneja la bici
}


