import java.util.ArrayList;
import java.util.List;
public class MapaMundo {
    public static void main(String[] args) {
        Continente america = new Continente("América");
        Continente europa = new Continente("Europa");
        Continente africa = new Continente("África");
        List<Continente> continentes = new ArrayList<>();
        continentes.add(america);
        continentes.add(europa);
        continentes.add(africa);

        List<Pais> paisesAmerica = new ArrayList<>();
        List<Pais> paisesEuropa = new ArrayList<>();
        List<Pais> paisesAfrica = new ArrayList<>();

        Pais canada = new Pais("Canadá", "Ottawa", america);
        Pais mexico = new Pais("México", "Ciudad de México", america);
        Pais brasil = new Pais("Brasil", "Brasilia", america);
        Pais españa = new Pais("España", "Madrid", europa);
        Pais francia = new Pais("Francia", "París", europa);
        Pais uganda = new Pais("Uganda", "Kampala", europa);

        paisesAmerica.add(canada);
        paisesAmerica.add(mexico);
        paisesAmerica.add(brasil);

        paisesEuropa.add(españa);
        paisesEuropa.add(francia);

        paisesAfrica.add(uganda);

        List<Provincia> provinciasCanada = new ArrayList<>();
        List<Provincia> provinciasMexico = new ArrayList<>();
        List<Provincia> provinciasBrasil = new ArrayList<>();
        List<Provincia> provinciasEspaña = new ArrayList<>();
        List<Provincia> provinciasFrancia = new ArrayList<>();

        Provincia ontario = new Provincia("Ontario");
        Provincia quebec = new Provincia("Quebec");
        Provincia yucatan = new Provincia("Yucatán");
        Provincia alberta = new Provincia("Alberta");
        Provincia jalisco = new Provincia("Jalisco");
        Provincia nuevoLeon = new Provincia("Nuevo León");
        Provincia saoPaulo = new Provincia("Sao Paulo");
        Provincia rioJaneiro = new Provincia("Rio de Janeiro");
        Provincia catalunya = new Provincia("Catalunya");
        Provincia madrid = new Provincia("Madrid");

        provinciasCanada.addAll(List.of(ontario, quebec, alberta));
        provinciasMexico.addAll(List.of(jalisco, yucatan));
        provinciasBrasil.add(saoPaulo);
        provinciasBrasil.add(rioJaneiro);

        provinciasEspaña.add(catalunya);
        provinciasEspaña.add(madrid);
        provinciasEspaña.add(nuevoLeon);

        canada.setProvincias(provinciasCanada);
        mexico.setProvincias(provinciasMexico);
        brasil.setProvincias(provinciasBrasil);
        españa.setProvincias(provinciasEspaña);
        francia.setProvincias(provinciasFrancia);

        america.setPaises(paisesAmerica);
        europa.setPaises(paisesEuropa);
        africa.setPaises(paisesAfrica);
        System.out.println("Información del mapa del mundo:");
        System.out.println("------------------------------");
        System.out.println("Continentes:");
        for (Continente continente : continentes) {
            System.out.println(continente.getNombre());
        }
        System.out.println();

        System.out.println("Países en América:");
        for (Pais pais : america.getPaises()) {
            System.out.println(pais.getNombre()+", Capital: " + pais.getCapital());
            System.out.println("Provincias:");
            for (Provincia provincia : pais.getProvincias()) {
                System.out.println(provincia.getNombre());
            }
            System.out.println();
        }

        System.out.println("Países en Europa:");
        for (Pais pais : europa.getPaises()) {
            System.out.println(pais.getNombre()+", Capital: " + pais.getCapital());
            System.out.println("Provincias:");
            for (Provincia provincia : pais.getProvincias()) {
                System.out.println(provincia.getNombre());
            }
            System.out.println();
        }
        System.out.println("Países en África:");
        for (Pais pais : africa.getPaises()) {
            System.out.println(pais.getNombre()+", Capital: " + pais.getCapital());
            System.out.println("Provincias:");
            for (Provincia provincia : pais.getProvincias()) {
                System.out.println(provincia.getNombre());
            }
            System.out.println();
        }
    }
}