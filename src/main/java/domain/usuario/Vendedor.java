package domain.usuario;

import domain.ServicioExterno;
import domain.productos.Producto;
import domain.publicaciones.MedioDePago;

import java.util.ArrayList;
import java.util.List;

public class Vendedor extends Usuario{
    private List<Producto> publicacionesCargadas;

    public Vendedor(String id, String password, TipoDeUsuario tipoDeUsuario){
        super(id, password, tipoDeUsuario);
        this.publicacionesCargadas= new ArrayList<>();
    }

    public void cargarPublicacion (Producto productoNuevo){
        publicacionesCargadas.add(productoNuevo);
    }

    public void aceptarPago(MedioDePago medioDePago, int monto, String comprador){
        ServicioExterno.emitirFactura(medioDePago, monto, comprador, this.getId()){
        }
    }


    //hacer que la manera de conseguir el tipo de usuario no sea a traves de un atributo
    //sino a traves de un metodo en cada tipo de usuario

    // TODO: 16/9/2022 como me conecto con el ServicioExternoFacturas? Es una dependencia
    //https://www.afip.gob.ar/ws/documentacion/ws-factura-electronica.asp ??

    //hacer un metodo donde el comprador le pasa info al vendedor del carrito y zaraza para que luego el
    // vendedor agarre esa info y se la envie al servicio externo

}
