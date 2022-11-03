package domain.models.entities.usuario;

import domain.models.entities.Carrito.CarritoDeCompras;
import domain.models.entities.Carrito.EstadoCompra;
import domain.models.entities.Carrito.EstadoPagos;
import domain.models.entities.publicaciones.MedioDePago;
import domain.models.entities.publicaciones.PersonalizacionVendedores;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

import static domain.models.entities.Carrito.EstadoPagos.PENDIENTE_PAGO;

@Entity
@Setter
@Getter
@DiscriminatorValue("comprador")
public class Comprador extends Usuario {
    @OneToMany
    private List<CarritoDeCompras> carritosDeCompras;

    public Comprador() {
        this.carritosDeCompras = new ArrayList<>();
    }

    public void agregarCarrito(CarritoDeCompras carritoDeCompras){
        this.carritosDeCompras.add(carritoDeCompras);
    }
    public void pagarCarrito(CarritoDeCompras carrito) {
        EstadoCompra esperandoPago= new EstadoCompra(carrito, PENDIENTE_PAGO);
        carrito.getPagoCarrito().agregarEstadoCompra(esperandoPago);
        vendedor.confirmarPago(carrito);

    }
}

