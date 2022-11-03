package domain.models.entities.usuario;

import domain.models.entities.Carrito.CarritoDeCompras;
import domain.models.entities.Carrito.EstadoCompra;
import domain.models.entities.publicaciones.MedioDePago;
import domain.models.entities.publicaciones.Publicacion;
import lombok.Getter;
import lombok.Setter;
import org.springframework.transaction.TransactionUsageException;

import javax.persistence.*;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import static domain.models.entities.Carrito.EstadoPagos.PENDIENTE_PAGO;

@Entity
@Getter
@Setter
@DiscriminatorValue("vendedor")
public class Vendedor extends Usuario {
    @OneToMany
    private List<Publicacion> publicaciones;
    @OneToMany
    private List<MedioDePago> mediosDePagoAceptados;
    public Vendedor() {
        this.publicaciones = new ArrayList<>();
        this.mediosDePagoAceptados = new ArrayList<>();
    }
    public void agregarPublicacion(Publicacion publicacionNueva){
        this.publicaciones.add(publicacionNueva);
    }
    public void agregarMediosDePago(MedioDePago medioNuevo){
        this.mediosDePagoAceptados.add(medioNuevo);
    }

    public InputStream aceptar(InputStream respuesta){
        return respuesta;
    }
    public void confirmarPago(CarritoDeCompras carrito){
        if (this.aceptar(System.in)) {
            EstadoCompra pagoAceptado = new EstadoCompra(carrito, PENDIENTE_PAGO);
            carrito.getPagoCarrito().agregarEstadoCompra(pagoAceptado);
        }


    }
    public void cargarPublicacion(Publicacion publicacionNueva) {
        publicaciones.add(publicacionNueva);
    }
}

//    public void aceptarPago(MedioDePago medioDePago, int monto, Comprador comprador) {
//    //    ServicioExterno.emitirFactura(medioDePago, monto, comprador.getId(), this.getId());
//        //solo le envia el mensaje al comprador si se logra pagar el carrito, ver la excepcion
//        comprador.setEstadoCarrito(EstadoCarrito.PAGADO);
//    }
//}

// TODO: 3/11/2022
// hacer un metodo donde el comprador le pasa info al vendedor del carrito y zaraza para que luego el
// vendedor agarre esa info y se la envie al servicio externo


