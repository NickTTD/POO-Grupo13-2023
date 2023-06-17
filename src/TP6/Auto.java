package TP6;

import java.util.Scanner;

public class Auto implements ImpactoEcologico{
    private String modelo;
    private String color;
    private Double ImpactoTotal;
	
    public double obtenerImpactoEcologico() {
       Scanner scanner = new Scanner(System.in);
       
       System.out.println("Ingresa el modelo del auto:");
       modelo = scanner.nextLine();

       System.out.println("Ingresa el color del auto:");
       color = scanner.nextLine();
       
       System.out.println("Ingresa la cantidad de KM recorridos en: " + modelo + " " + color );
			double cantidadKM = scanner.nextDouble();
			
			double emisionesManufacturaKG = 500;
			
			//double emisionesCombustible = (cantidadKM*0.2)+(cantidadKM*2.3); //Leer comentario abajo
			ImpactoTotal = (cantidadKM * 0.02) +emisionesManufacturaKG;
		
			
        return ImpactoTotal;
    }//0.2 = Estimación de emisiones de CO2 en KG por km de la manufactura de combustible
    //2.3 = emisiones de CO2 en KG por km emitidos por la combustión
}
