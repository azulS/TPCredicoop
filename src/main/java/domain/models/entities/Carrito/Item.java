package domain.models.entities.Carrito;

import domain.Persistente;
import domain.models.entities.publicaciones.PrecioPorArea;
import domain.models.entities.publicaciones.Publicacion;
import lombok.Getter;
import lombok.Setter;


import javax.persistence.*;

@Entity
@Table(name="Item")
@Getter
@Setter
public class Item extends Persistente {

    @ManyToOne
    @JoinColumn(name="carrito_id", referencedColumnName = "id")
    private CarritoDeCompras carrito;

//    @Column
//    private Publicacion publicacion;
    @Column
    private int cantidad;
//    public Item(Publicacion publicacion, PrecioPorArea areaSeleccionada) {
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
