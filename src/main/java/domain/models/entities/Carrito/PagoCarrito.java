package domain.models.entities.Carrito;

import domain.Persistente;
import domain.models.entities.publicaciones.MedioDePago;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@Table

public class PagoCarrito extends Persistente {

    @Column
    private int monto;

    @OneToOne
    private MedioDePago medioDePago;

    @OneToMany
    @Column (name = "estadoCarrito")
    private List<EstadoCompra> estadoDeCompra;

    public PagoCarrito (){
        this.estadoDeCompra =new ArrayList<>();
    }
}
