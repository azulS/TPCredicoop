package domain.models.entities.Carrito;

import domain.Persistente;
import domain.models.entities.publicaciones.MedioDePago;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table (name = "EstadoCarrito")
@Getter
@Setter
public class EstadoCarrito extends Persistente {

    @ManyToOne
    @JoinColumn (name = "carritoDeCompras_id", referencedColumnName= "id")
    private CarritoDeCompras carrito;

    @OneToOne
    private MedioDePago formaDePago;

    @OneToMany
    private List<EstadoCompra> estadoDeCompra;

    public EstadoCarrito(){
        this.estadoDeCompra= new ArrayList<>();
    }
}
