package domain.models.entities.Carrito;

import domain.Persistente;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table
public class EstadoCompra extends Persistente {
    @ManyToOne
    @JoinColumn (name = "EstadoCarrito_id", referencedColumnName= "id")
    private EstadoCarrito estadoCarrito;

    @Column
    private LocalDateTime fechaYhora;

    @Enumerated (EnumType.STRING)
    @Column (name = "estadoDelPago")
    private EstadoPagos estado1;
}
