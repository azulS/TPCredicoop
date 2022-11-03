package domain.models.entities.usuario;

import domain.models.entities.Carrito.CarritoDeCompras;
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


//    public void setEstadoCarrito(EstadoCarrito estadoCarrito){
//        this.estadoCarrito = estadoCarrito;
//        carritoDeCompras.setEstado(estadoCarrito);
        //Solo lo puede hacer el vendedor
//    }

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

