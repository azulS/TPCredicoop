package domain.models.entities.Carrito;

import com.sun.xml.bind.v2.TODO;
import domain.Persistente;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table
@Getter
@Setter
public class EstadoCompra extends Persistente {
    @ManyToOne
    @JoinColumn (name = "CarritoDeCompras_id", referencedColumnName= "id")
    private CarritoDeCompras carritoDeCompras;

    @Column
    private LocalDateTime fechaYhora;

    @Enumerated (EnumType.STRING)
    @Column (name = "estadoDelPago")
    private EstadoPagos estado;
    public EstadoCompra(){
        setEstado(EstadoPagos.CARRITO_VACIO);
    }

}
