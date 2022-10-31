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
@Table
@Getter
@Setter
public class EstadoCarrito extends Persistente {
    @OneToOne
    private MedioDePago formaDePago;

    @OneToOne
    private CarritoDeCompras carrito;

    @OneToMany
    private List<EstadoCompra> estado;

    public EstadoCarrito(){
        this.estado= new ArrayList<>();
    }
}
