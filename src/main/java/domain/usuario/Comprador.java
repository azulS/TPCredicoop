package domain.usuario;

import domain.Carrito.CarritoDeCompras;
import domain.Carrito.PagoCarrito;
import domain.publicaciones.MedioDePago;


public class Comprador extends Usuario {
    private CarritoDeCompras carritoDeCompras;
    private PagoCarrito pagoCarrito = PagoCarrito.VACIO;

    public Comprador(String id, TipoDeUsuario tipoDeUsuario, GestorDeUsuarios autenticado) {
        super(id, tipoDeUsuario, autenticado);
    }

    public void abrirNuevoCarrito(CarritoDeCompras carritoDeCompras) {
        this.carritoDeCompras = carritoDeCompras;
        this.pagoCarrito = carritoDeCompras.getPagoCarrito();
    }
    // TODO: 27/9/2022 como abro un carrito de compras?

    public void setEstadoCarrito(PagoCarrito pagoCarrito){
        this.pagoCarrito= pagoCarrito;
        carritoDeCompras.setEstado(pagoCarrito);
        //Solo lo puede hacer el vendedor
    }

    //por cada publicacion del carrito:
    //1-mostrar medios de pago disponibles
    // 2-si uno de los medios de pago disponibles es igual al parametro de pagarCarrito
    // 3- enviarle el medio de pago al vendedor
    public void pagarCarrito(MedioDePago medioDePago) {
        carritoDeCompras.getPublicacionesCarrito().forEach(p -> {
            p.getPublicacion().printMediosDePago();
            for (MedioDePago m : p.getPublicacion().getMediosDePago()) {
                if (m.equals(medioDePago)) {
                    p.getPublicacion().getVendedor().aceptarPago(medioDePago, carritoDeCompras.getMonto(), this);
                }
            }
        });
    }
}
// TODO: 27/9/2022 intentar agrupar en el carrito los productos segun cada vendedor
//definir un else si no coincide con ninguno de los medios de pago disponibles el medio cargado
