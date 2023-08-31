package TP7;

import java.time.LocalDate;

//*De la Compra se conoce el Cliente que la realizo, la fecha y el Detalle de la Compra (Lineas
//*de Compra).
public class Compra {
    private String cliente;
    private LocalDate fecha;
    private Integer promocion;

    public Compra(String cliente) {
        this.cliente = cliente;
        this.fecha = LocalDate.now();
    }

    public Compra(String cliente, Integer promocion) {
        this.cliente = cliente;
        this.fecha = LocalDate.now();
        this.promocion = promocion;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Integer getPromocion() {
        return promocion;
    }

    public void setPromocion(Integer promocion) {
        this.promocion = promocion;
    }

}
