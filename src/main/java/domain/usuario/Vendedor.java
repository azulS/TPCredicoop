package domain.usuario;

import domain.ServicioExterno;
import domain.productos.Producto;
import domain.publicaciones.MedioDePago;
import domain.publicaciones.Publicacion;

import java.util.ArrayList;
import java.util.List;

public class Vendedor extends Usuario{
    private List<Publicacion> publicacionesCargadas;

    public Vendedor(GestorDeUsuarios autenticador, String id, String password, TipoDeUsuario tipoDeUsuario){
        super(id, password, tipoDeUsuario, autenticador);
        this.publicacionesCargadas= new ArrayList<>();
    }

    public void cargarPublicacion (Publicacion publicacionNueva){
        publicacionesCargadas.add(publicacionNueva);
    }

    public void aceptarPago(MedioDePago medioDePago, int monto, String comprador){
        ServicioExterno.emitirFactura(medioDePago, monto, comprador, this.getId());
        }
        //le envia un mensaje a COmprador para que cambie el estado de su carrito
    }


    //hacer que la manera de conseguir el tipo de usuario no sea a traves de un atributo
    //sino a traves de un metodo en cada tipo de usuario

    // TODO: 16/9/2022 como me conecto con el ServicioExternoFacturas? Es una dependencia
    //https://www.afip.gob.ar/ws/documentacion/ws-factura-electronica.asp ??

    //hacer un metodo donde el comprador le pasa info al vendedor del carrito y zaraza para que luego el
    // vendedor agarre esa info y se la envie al servicio externo

