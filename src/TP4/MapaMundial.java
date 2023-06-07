package TP4;

import java.util.List;
import java.util.ArrayList;

public class MapaMundial {
    private List<Continente> continentes;

    public MapaMundial() {
        continentes = new ArrayList<>();
    }

    public void inicializar() {
        // INICIALIZA CONTINENTES
        Continente america = new Continente("America");
        Continente europa = new Continente("Europa");
        Continente asia = new Continente("Asia");
        Continente africa = new Continente("África");
        Continente oceania = new Continente("Oceania");
        Continente antartida = new Continente("Antartida");

        // INICIALIZA PAIS Y CARGA PROVINCIAS
        
        Pais argentina = new Pais("Argentina", "Buenos Aires");
        argentina.addProvincia(new Provincia("Entre Rios", argentina));
        argentina.addProvincia(new Provincia("Santa Fe", argentina));
        argentina.addProvincia(new Provincia("Buenos Aires", argentina));
        argentina.addProvincia(new Provincia("Corrientes", argentina));
        argentina.addProvincia(new Provincia("Cordoba", argentina));
        

        Pais uruguay = new Pais("Uruguay", "Montevideo");
        uruguay.addProvincia(new Provincia("Montevideo",uruguay));
        uruguay.addProvincia(new Provincia("Salto",uruguay));
        uruguay.addProvincia(new Provincia("Paysandu",uruguay));
        uruguay.addProvincia(new Provincia("Canelones",uruguay));
        uruguay.addProvincia(new Provincia("Rocha",uruguay));
        uruguay.addProvincia(new Provincia("Maldonado",uruguay));
        
       
        Pais brasil = new Pais("Brasil", "Brasilia");
        Pais chile = new Pais("Chile", "Santiago");
        Pais paraguay = new Pais("Paraguay", "Asuncion");
        Pais bolivia = new Pais("Bolivia", "La Paz");
        
        //AÑADE A PAISES A CONTINENTE
        america.addPais(argentina);
        america.addPais(uruguay);
        america.addPais(brasil);
        america.addPais(chile);
        america.addPais(paraguay);
        america.addPais(bolivia);
        
        // PASA PAISES LIMITROFRES
        argentina.addLimitrofe(uruguay); 
        uruguay.addLimitrofe(argentina);
        argentina.addLimitrofe(uruguay);
        argentina.addLimitrofe(paraguay);
        argentina.addLimitrofe(brasil);
        argentina.addLimitrofe(bolivia);
        argentina.addLimitrofe(chile);

        uruguay.addLimitrofe(argentina);
        uruguay.addLimitrofe(brasil);
        uruguay.addLimitrofe(paraguay);

        paraguay.addLimitrofe(argentina);
        paraguay.addLimitrofe(brasil);
        paraguay.addLimitrofe(bolivia);

        brasil.addLimitrofe(argentina);
        brasil.addLimitrofe(uruguay);
        brasil.addLimitrofe(paraguay);
        brasil.addLimitrofe(bolivia);

        bolivia.addLimitrofe(paraguay);
        bolivia.addLimitrofe(brasil);
        bolivia.addLimitrofe(chile);

        chile.addLimitrofe(argentina);
        chile.addLimitrofe(bolivia);

        // CREA Y INICIALIZA PAIS DE EUROPA
        Pais españa = new Pais("España", "Madrid");
        Pais francia = new Pais("Francia", "Paris");
        Pais italia = new Pais("Italia", "Roma");
        Pais portugal = new Pais("Portugal", "Lisboa");

        europa.addPais(españa);
        europa.addPais(francia);
        europa.addPais(italia);
        europa.addPais(portugal);

        // AGREGA PAIS A CONTINENTE
        continentes.add(america);
        continentes.add(europa);
        continentes.add(asia);
        continentes.add(africa);
        continentes.add(oceania);
        continentes.add(antartida);
    }
    

    public List<Pais> getPaises(String continente) {
        List<Pais> paisesContinente = new ArrayList<>();
        for (Continente c : continentes) {
            if (c.getNombre().equalsIgnoreCase(continente)) {
                paisesContinente.addAll(c.getPaises());
                break;
            }
        }
        return paisesContinente;
    }

    public List<Provincia> getProvincias(String pais) {
        List<Provincia> provinciasPais = new ArrayList<>();
        for (Continente c : continentes) {
            for (Pais p : c.getPaises()) {
                if (p.getNombre().equalsIgnoreCase(pais)) {
                    provinciasPais.addAll(p.getProvincias());
                    break;
                }
            }
        }
        return provinciasPais;
    }
    
    public Pais getPais(String nombrePais) {
        for (Continente continente : continentes) {
            for (Pais pais : continente.getPaises()) {
                if (pais.getNombre().equalsIgnoreCase(nombrePais)) {
                    return pais;
                }
            }
        }
        return null;
    }

    public List<Pais> getLimitrofes(String nombrePais) {
        Pais pais = getPais(nombrePais);
        if (pais != null) {
            return pais.getLimitrofes();
        }
        return new ArrayList<Pais>();
    }

    public static void main(String[] args) {
        MapaMundial mapa = new MapaMundial();
        mapa.inicializar();
    }
}