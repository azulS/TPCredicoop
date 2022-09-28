package domain.usuario;

import domain.Carrito.CarritoDeCompras;
import domain.Carrito.PagoCarrito;
import domain.publicaciones.MedioDePago;
import domain.ServicioExterno;
import lombok.Getter;
import lombok.Setter;

@Getter
public abstract class Usuario  {
    private GestorDeUsuarios autenticador;
    private String password;
    @Setter
    private String id;
    @Setter
    private TipoDeUsuario tipoDeUsuario;
    public Usuario(String id, TipoDeUsuario tipoDeUsuario, GestorDeUsuarios autenticador) {
        //este seria el constructor para el usuario COMPRADOR
        this.id = id;
        this.password= null;
        this.tipoDeUsuario = tipoDeUsuario;
        this.autenticador = autenticador;
        autenticador.agregarNuevoUsuario(this);
    }
    public Usuario(String id, String password, TipoDeUsuario tipoDeUsuario, GestorDeUsuarios autenticador) {
        //este seria el constructor para los tipos de usuarios GESTOR y VENDEDOR
        this.id = id;
        this.password = password;
        this.tipoDeUsuario = tipoDeUsuario;
        this.autenticador = autenticador;
        autenticador.agregarNuevoUsuario(this);
    }

    public void aceptarPago(MedioDePago medioDePago, CarritoDeCompras pedido, int monto, Usuario usuario){
        if (pedido.getMonto() == monto) {
            ServicioExterno.emitirFactura(medioDePago, monto, usuario.getId(), this.id);
            pedido.setEstado(PagoCarrito.PAGADO);
        }
    }

    // TODO: 16/9/2022 hacer excepciones try...catch por si se confundio la contrasenia al entrar

}
