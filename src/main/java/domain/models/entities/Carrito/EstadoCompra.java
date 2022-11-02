package domain.models.entities.Carrito;

import domain.Persistente;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table
public class EstadoCompra extends Persistente {
    @ManyToOne
    @JoinColumn (name = "CarritoDeCompras_id", referencedColumnName= "id")
    private CarritoDeCompras carritoDeCompras;

    @Column
    private LocalDateTime fechaYhora;

    @Enumerated (EnumType.STRING)
    @Column (name = "estadoDelPago")
    private EstadoPagos estado1;
}
