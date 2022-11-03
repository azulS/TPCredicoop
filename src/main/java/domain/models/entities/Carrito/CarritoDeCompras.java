package domain.models.entities.Carrito;

import domain.Persistente;
import domain.models.entities.usuario.Comprador;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="CarritoDeCompras")
@Getter
@Setter
public class CarritoDeCompras extends Persistente {

    @ManyToOne
    @JoinColumn(name = "usuario_id", referencedColumnName = "id")
    private Comprador user;

    @OneToOne
    private PagoCarrito pagoCarrito;

    @OneToMany
    @Column(name = "contenidoCarrito")
    private List<ContenidoCarrito> contenidoCarrito;

    public CarritoDeCompras() {
        this.contenidoCarrito = new ArrayList<>();
        this.pagoCarrito = new PagoCarrito();
    }

    public void agregarContenidoCarrito(ContenidoCarrito contenidoNuevo){
        this.contenidoCarrito.add(contenidoNuevo);
    }
}

//    // TODO: 16/9/2022  hacer una excepcion respecto al servicio externo del que te hace la factura.
//    //  lo mismo una excepcion por si no me aceptan el pago (dos try...catch)
//    //cuando agrego una publicacion al carrito de compras tambien le asigno un producto al Id Carrito de Comprador
//    //cuando agrego una publicaion al carrito de compras le cambio el estado Carrito a comprador
//
//    // TODO: 16/9/2022 hacer excepcion try...catch
//    //  por si el comprador quiere pagar el carrito y alguna de las publicaciones estan canceladas
