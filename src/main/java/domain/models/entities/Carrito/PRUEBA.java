package domain.models.entities.Carrito;

import domain.models.entities.usuario.Comprador;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class PRUEBA{
    @Id
    @GeneratedValue
    private Long id;
}



//

//
//    public CarritoDeCompras(Comprador comprador){
//        this.user = comprador;
//        //      this.idCarrito = (int)Math.random()+(int)Math.random()*10+(int)Math.random()*100+(int)Math.random()*1000;
//        this.contenidoCarrito =new ArrayList<>();
//        this.monto= 0;
//        this.estadoCarrito = EstadoCarrito.VACIO;
//        comprador.abrirNuevoCarrito(this);
//        //cual es el parametro que le paso al comprador cuando creo un nuevo carrito asi le figura
//        // en su lista de carritos?
//    }
//    public void setMonto(int monto) {
//        contenidoCarrito.forEach(publicacion -> {
//            //               this.monto= monto+ publicacion.getPecioItem();
//        });
//    }
//    public void setEstado(EstadoCarrito estado){
//        this.estadoCarrito = estado;
//    }
//    public void agregarPublicacionACarrito(Item publicacionNueva){
//        contenidoCarrito.add(publicacionNueva);
//        this.setEstado(EstadoCarrito.SIN_PAGAR);
//    }
//
//    // TODO: 16/9/2022  hacer una excepcion respecto al servicio externo del que te hace la factura.
//    //  lo mismo una excepcion por si no me aceptan el pago (dos try...catch)
//    //cuando agrego una publicacion al carrito de compras tambien le asigno un producto al Id Carrito de Comprador
//    //cuando agrego una publicaion al carrito de compras le cambio el estado Carrito a comprador
//
//    // TODO: 16/9/2022 hacer excepcion try...catch
//    //  por si el comprador quiere pagar el carrito y alguna de las publicaciones estan canceladas
//    // TODO: 19/9/2022 como se relaciona con las publicaciones o los productos y los compradores?
//    //para crear el Id del carrito se utiliza un numero random que no este en la base de datos de carritos existentes
//}
//