package domain.models.entities.usuario;

import domain.models.entities.Carrito.CarritoDeCompras;
import domain.models.entities.Carrito.EstadoCarrito;
import domain.models.entities.publicaciones.MedioDePago;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

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

    //    private EstadoCarrito estadoCarrito = EstadoCarrito.VACIO;

    public void abrirNuevoCarrito(CarritoDeCompras carritoDeCompras) {
//        this.carritoDeCompras = carritoDeCompras;
//        this.estadoCarrito = carritoDeCompras.getEstadoCarrito();
    }
    // TODO: 27/9/2022 como abro un carrito de compras?

    public void setEstadoCarrito(EstadoCarrito estadoCarrito){
//        this.estadoCarrito = estadoCarrito;
//        carritoDeCompras.setEstado(estadoCarrito);
        //Solo lo puede hacer el vendedor
    }

    //por cada publicacion del carrito:
    //1-mostrar medios de pago disponibles
    // 2-si uno de los medios de pago disponibles es igual al parametro de pagarCarrito
    // 3- enviarle el medio de pago al vendedor
    public void pagarCarrito(MedioDePago medioDePago) {
//        carritoDeCompras.getContenidoCarrito().forEach(p -> {
////            p.getPublicacion().printMediosDePago();
//            for (MedioDePago m : p.getPublicacion().getMediosDePago()) {
//                if (m.equals(medioDePago)) {
//                    p.getPublicacion().getVendedor().aceptarPago(medioDePago, carritoDeCompras.getMonto(), this);
//                }
//            }
//        });
   }
}
// TODO: 27/9/2022 intentar agrupar en el carrito los productos segun cada vendedor
//definir un else si no coincide con ninguno de los medios de pago disponibles el medio cargado
