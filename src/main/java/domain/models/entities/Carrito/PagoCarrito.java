package domain.models.entities.Carrito;

import domain.Persistente;
import domain.models.entities.publicaciones.MedioDePago;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@Table

public class PagoCarrito extends Persistente {
    @OneToOne
    @JoinColumn (name = "carritoDeCompras_id", referencedColumnName = "id")
    private CarritoDeCompras carritoDeCompras;

    @Column
    private int monto;

    @OneToOne
    private MedioDePago medioDePago;
    @Transient
    @OneToMany
    @Column (name = "estadoCarrito")
    private List<EstadoCompra> estadoDeCompra;

    public PagoCarrito (){
        this.estadoDeCompra =new ArrayList<>();
    }
    public void confirmar(boolean respuesta){
        this.estadoDeCompra =new ArrayList<>();
        if (respuesta){
        estadoDeCompra.get(getEstadoDeCompra().size()-1).setEstado(EstadoPagos.CONFIRMADO);
    }
        if (!respuesta){
            estadoDeCompra.get(getEstadoDeCompra().size()-1).setEstado(EstadoPagos.RECHAZADO);
        }
//        else{
//            // TODO: 3/11/2022 try/catch
//        }
    }

    public void agregarEstadoCompra(EstadoCompra estadoCompraNuevo){
        this.estadoDeCompra.add(estadoCompraNuevo);
    }

    public void pagar(){
        estadoDeCompra.get(getEstadoDeCompra().size()-1).setEstado(EstadoPagos.PENDIENTE_PAGO);
    }


    // TODO: 3/11/2022 para setear el medioDePago tengo que ver los medios de pago disponibles.
    //  Los medios de pago disponibles:
    //      vendedor.mediosDePagoAceptados().forEach

    // TODO: 3/11/2022 MONTO=
    //      PRECIO GESTOR= carrito.contenidoCarrito.personalizacionVendedores.publicacion.contenidoPublicacion.producto.precioBase
    //      PRECIO VENDEDOR= carrito.contenidoCarrito.personalizacionVendedores.precio

}
