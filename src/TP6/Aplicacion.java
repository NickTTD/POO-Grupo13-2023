/* Escriba una aplicación que cree objetos de cada una de las tres clases, coloque referencias
a esos objetos en ArrayList<ImpactoEcologicos y después itere a través del objeto ArrayList, 
invocando en forma polimórfica el método obtener ImpactoEcologico de cada objeto. Para cada 
objeto imprima cierta información de identificación, además de su impacto ecológico.
package TP6;*/
package TP6;
import java.util.ArrayList;

public class Aplicacion {
    	public static void main(String[] args) {
        EdificioResidencial edificio = new EdificioResidencial();
        Auto auto = new Auto();
        Bicicleta bicicleta = new Bicicleta();

        ArrayList<ImpactoEcologico> objetosImpacto = new ArrayList<>();

        objetosImpacto.add(edificio);
        objetosImpacto.add(auto);
        objetosImpacto.add(bicicleta);

        for (ImpactoEcologico objeto : objetosImpacto) {
            System.out.println("Información de identificación: " + objeto.getClass().getSimpleName());
            System.out.println("Impacto ecológico: " + objeto.obtenerImpactoEcologico()+"KG de Co2");
            System.out.println();
        }     
	}
    
}
