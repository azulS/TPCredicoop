package domain.models.entities.usuario;

import domain.models.entities.Carrito.CarritoDeCompras;
import domain.models.entities.Carrito.EstadoCompra;
import domain.models.entities.ServicioExterno;
import domain.models.entities.publicaciones.MedioDePago;
import domain.models.entities.publicaciones.Publicacion;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

import static domain.models.entities.Carrito.EstadoPagos.*;

@Entity
@Getter
@Setter
@DiscriminatorValue("vendedor")
public class Vendedor extends Usuario {
    @OneToMany
    @Transient
    private List<Publicacion> publicaciones;
    @OneToMany
    @Transient
    private List<MedioDePago> mediosDePagoAceptados;
    @ElementCollection
    @Transient
    private List<Integer> facturasElectronicas;
    
    public Vendedor() {
        this.publicaciones = new ArrayList<>();
        this.mediosDePagoAceptados = new ArrayList<>();
        this.facturasElectronicas = new ArrayList<>();
    }
    public void agregarPublicacion(Publicacion publicacionNueva){
        this.publicaciones.add(publicacionNueva);
    }
    public void agregarMediosDePago(MedioDePago medioNuevo){
        this.mediosDePagoAceptados.add(medioNuevo);
    }

    public void confirmarPago(CarritoDeCompras carrito){
        if (System.console().readLine()== "Y") {
            EstadoCompra pagoAceptado = new EstadoCompra(carrito, CONFIRMADO);
            carrito.getPagoCarrito().agregarEstadoCompra(pagoAceptado);

            Integer facturaNueva = Integer.valueOf(ServicioExterno.generarFacturaElectronica(carrito));
            this.facturasElectronicas.add(facturaNueva);

            // TODO: 4/11/2022 estaria bueno separarlo en dos subacciones que realiza el vendedor
            //  o es demaciado minuisioso?
        }
        else {
            EstadoCompra pagoAceptado = new EstadoCompra(carrito, RECHAZADO);
            carrito.getPagoCarrito().agregarEstadoCompra(pagoAceptado);
        }
    }
}

// TODO: 4/11/2022 asumi que la factura que le genera afip simplemente es un codigo de barras o algo asi
// TODO: 4/11/2022 no habria que enviarle al servicio externo TODA la info de carrito
//      sino la info pertinente para generar la factura

