package domain.models.entities.Carrito;

import domain.Persistente;
import domain.models.entities.usuario.Comprador;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="CarritoDeCompras")
@Getter
@Setter
public class CarritoDeCompras extends Persistente{

    @ManyToOne
    @JoinColumn(name="comprador_id", referencedColumnName = "id")
    private Comprador user;

    @Column
    private int monto;

    @OneToOne
    private EstadoCarrito estadoCarrito;

    @OneToMany
    private List<Item> contenidoCarrito;
    public CarritoDeCompras(Comprador comprador){
        this.contenidoCarrito =new ArrayList<>();
        this.monto= 0;
        this.contenidoCarrito = new ArrayList<>();
    }
}
