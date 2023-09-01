package TP7;

import java.time.LocalDate;

import TP7.recursos.DTOCliente;

//*De la Compra se conoce el Cliente que la realizo, la fecha y el Detalle de la Compra (Lineas
//*de Compra).
public class Compra {
    private DTOCliente Cliente;
    private LocalDate fecha;
    private Integer promocion;

    public Compra(DTOCliente cliente) {
        this.Cliente = cliente;
        this.fecha = LocalDate.now();
    }

    public Compra(DTOCliente cliente, Integer promocion) {
        this.Cliente = cliente;
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
