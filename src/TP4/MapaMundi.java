package TP4;
import java.util.List;
import java.util.Scanner;
public class MapaMundi {

    public static void main(String[] args) {
        MapaMundial mapa = new MapaMundial();
        mapa.inicializar();

        Scanner in = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Listar países de un continente");
            System.out.println("2. Listar provincias de un país");
            System.out.println("3. Listar países limítrofes de un país");
            System.out.println("4. Salir");

            int opcion = in.nextInt();
            in.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el nombre del continente:");
                    String continente = in.nextLine();

                    List<Pais> paises = mapa.getPaises(continente);
                    if (paises.isEmpty()) {
                        System.out.println("No se encontraron países en el continente especificado.");
                    } else {
                        System.out.println("Países en el continente " + continente + ":");
                        for (Pais pais : paises) {
                            System.out.println(pais.getNombre());
                        }
                    }
					esperarTecla();
                    break;

                case 2:
                    System.out.println("Ingrese el nombre del país:");
                    String pais = in.nextLine();

                    List<Provincia> provincias = mapa.getProvincias(pais);
                    if (provincias.isEmpty()) {
                        System.out.println("No se encontraron provincias en el país especificado.");
                    } else {
                        System.out.println("Provincias en el país " + pais + ":");
                        for (Provincia provincia : provincias) {
                            System.out.println(provincia.getNombre());
                         }
                    }
					esperarTecla();
                    break;

                case 3:
                    System.out.println("Ingrese el nombre de un país:");
                    String nombrePais = in.nextLine();
                    List<Pais> limitrofes = mapa.getLimitrofes(nombrePais);
                    if (!limitrofes.isEmpty()) {
                        System.out.println("Países limítrofes de " + nombrePais + ":");
                        for (Pais paisLimitrofe : limitrofes) {
							System.out.println(paisLimitrofe.getNombre());
						}
                        }
                     else {
                        System.out.println("No se encontraron países limítrofes para " + nombrePais);
                    }
					esperarTecla();
                    break;

                case 4:
                    salir = true;
                    break;

                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                    break;
            }
        }

        in.close();
    }
    public static void esperarTecla() {
        System.out.println("Presione cualquier tecla para continuar...");
        Scanner scanner = new Scanner(System.in);    //Si usas try para arreglar este leak se rompe :)
        scanner.nextLine();
    }
}
