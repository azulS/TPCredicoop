package domain.models.entities.usuario;

import domain.models.entities.Carrito.CarritoDeCompras;
import domain.models.entities.Carrito.EstadoCarrito;
import domain.models.entities.publicaciones.MedioDePago;
import domain.models.entities.ServicioExterno;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.persistence.Entity;

//@Entity
//@Table(name="Usuario")
@Entity
@Setter
@Getter
//@NoArgsConstructor
public abstract class Usuario //extends Persistente
         {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
@Column(name = "id", nullable = false)
private Long id;
//    @OneToOne
//    @Column
@Column
 private String password;
//    @Setter
//    @Enumerated(EnumType.STRING)
//    private TipoDeUsuario tipoDeUsuario;

             public void setId(Long id) {
                 this.id = id;
             }

             public Usuario(String id, TipoDeUsuario tipoDeUsuario, GestorDeUsuarios autenticador) {
        //este seria el constructor para el usuario COMPRADOR
        this.password= null;
//        this.tipoDeUsuario = tipoDeUsuario;
        autenticador.agregarNuevoUsuario(this);
    }
    public Usuario(String id, String password, TipoDeUsuario tipoDeUsuario, GestorDeUsuarios autenticador) {
        //este seria el constructor para los tipos de usuarios GESTOR y VENDEDOR
        this.password = password;
//        this.tipoDeUsuario = tipoDeUsuario;
        autenticador.agregarNuevoUsuario(this);
    }

    public void aceptarPago(MedioDePago medioDePago, CarritoDeCompras pedido, int monto, Usuario usuario){
//        if (pedido.getMonto() == monto) {
//       //     ServicioExterno.emitirFactura(medioDePago, monto, usuario.getId(), this.id);
//            pedido.setEstado(EstadoCarrito.PAGADO);
//        }
    }

    // TODO: 16/9/2022 hacer excepciones try...catch por si se confundio la contrasenia al entrar

}
