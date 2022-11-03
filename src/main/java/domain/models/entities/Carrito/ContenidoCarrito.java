package domain.models.entities.Carrito;

import domain.Persistente;
import domain.models.entities.publicaciones.PersonalizacionVendedores;
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
    private PersonalizacionVendedores personalizacionVendedores;
    
    @Column
    private int cantidad;


}
