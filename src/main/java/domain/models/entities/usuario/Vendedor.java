package domain.models.entities.usuario;

import domain.models.entities.Carrito.EstadoCarrito;
import domain.models.entities.ServicioExterno;
import domain.models.entities.publicaciones.MedioDePago;
import domain.models.entities.publicaciones.Publicacion;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Vendedor extends Usuario {
    @OneToMany
    private List<Publicacion> publicacionesCargadas;

    public Vendedor(String id, TipoDeUsuario tipoDeUsuario, GestorDeUsuarios autenticador) {
        super(id, tipoDeUsuario, autenticador);
        this.publicacionesCargadas = new ArrayList<>();
    }

    public void cargarPublicacion(Publicacion publicacionNueva) {
        publicacionesCargadas.add(publicacionNueva);
    }
}

//    public void aceptarPago(MedioDePago medioDePago, int monto, Comprador comprador) {
//    //    ServicioExterno.emitirFactura(medioDePago, monto, comprador.getId(), this.getId());
//        //solo le envia el mensaje al comprador si se logra pagar el carrito, ver la excepcion
//        comprador.setEstadoCarrito(EstadoCarrito.PAGADO);
//    }
//}

    //hacer que la manera de conseguir el tipo de usuario no sea a traves de un atributo
    //sino a traves de un metodo en cada tipo de usuario

    // TODO: 16/9/2022 como me conecto con el ServicioExternoFacturas? Es una dependencia
    //https://www.afip.gob.ar/ws/documentacion/ws-factura-electronica.asp ??

    //hacer un metodo donde el comprador le pasa info al vendedor del carrito y zaraza para que luego el
    // vendedor agarre esa info y se la envie al servicio externo


