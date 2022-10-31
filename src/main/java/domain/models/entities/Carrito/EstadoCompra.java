package domain.models.entities.Carrito;

import domain.Persistente;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table
public class EstadoCompra extends Persistente {
    @ManyToOne
    @JoinColumn (name = "EstadoCompra_id", referencedColumnName= "id")
    private EstadoCarrito estadoCarrito;

    @Column
    private LocalDateTime fechaYhora;

    @Enumerated (EnumType.STRING)
    private EstadoPagos estado;
}
