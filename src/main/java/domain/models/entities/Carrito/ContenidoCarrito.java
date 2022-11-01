package domain.models.entities.Carrito;

import domain.Persistente;
import domain.models.entities.publicaciones.Publicacion;
import lombok.Getter;
import lombok.Setter;


import javax.persistence.*;

@Entity
@Table(name="ContenidoCarrito")
@Getter
@Setter
public class ContenidoCarrito extends Persistente {

    @ManyToOne
    @JoinColumn(name="carrito_id", referencedColumnName = "id")
    private CarritoDeCompras carrito;

    @OneToOne
    private Publicacion item;
    
    @Column
    private int cantidad;

    // TODO: 31/10/2022 que hago con el id del item? 
    
//    public ContenidoCarrito(Publicacion publicacion, PrecioPorArea areaSeleccionada) {
//        this.publicacion = publicacion;
//    }

  //  public void agregarItem() {
     //   carritoDeCompras.agregarItemACarrito(this);
    //}

    //public int getPecioItem() {
    //    return this.publicacion.getPrecioPersonalizacion();}
    // TODO: 28/9/2022  
    // Hacer todos los setters de manera de que sea una condicion que la publicacion 
    // tenga el area seleccionada que se seleccion

    // TODO: 28/9/2022 hay que setear el medio de pago aca? 

}
