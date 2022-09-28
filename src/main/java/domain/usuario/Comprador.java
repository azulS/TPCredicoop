package domain.usuario;

import domain.CarritoDeCompras;
import domain.EstadoCarrito;
import domain.publicaciones.MedioDePago;


public class Comprador extends Usuario {
    private CarritoDeCompras carritoDeCompras;
    private EstadoCarrito pagoCarrito = EstadoCarrito.VACIO;

    public Comprador(String id, TipoDeUsuario tipoDeUsuario, GestorDeUsuarios autenticado) {
        super(id, tipoDeUsuario, autenticado);
    }

    public void abrirNuevoCarrito(CarritoDeCompras carritoDeCompras) {
        this.carritoDeCompras = carritoDeCompras;
        this.pagoCarrito = carritoDeCompras.getEstadoCarrito();
    }
    // TODO: 27/9/2022 como abro un carrito de compras? 

    //por cada publicacion del carrito:
    //1-mostrar medios de pago disponibles
    // 2-si uno de los medios de pago disponibles es igual al parametro de pagarCarrito
    // 3- enviarle el medio de pago al vendedor
    public void pagarCarrito(MedioDePago medioDePago) {
        carritoDeCompras.getPublicacionesCarrito().forEach(p -> {
            p.printMediosDePago();
            for (MedioDePago m : p.getMediosDePago()) {
                if (m.equals(medioDePago)) {
                    p.getVendedor().aceptarPago(medioDePago, carritoDeCompras.getMonto(), this.getId());
                }
            }
        });
    }
}
// TODO: 27/9/2022 intentar agrupar en el carrito los productos segun cada vendedor
//definir un else si no coincide con ninguno de los medios de pago disponibles el medio cargado
