package domain.models.entities.productos;

import domain.Persistente;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Table
@Entity
public class PersonalizacionGestores extends Persistente {
    @ManyToOne
    @JoinColumn(name = "producto_id", referencedColumnName= "id")
    private Producto producto;

    @OneToOne
    private AreaDePersonalizacion areasBase;

    @OneToMany
    private List<TipoDePersonalizacion> tiposDePersonalizacion;

    public PersonalizacionGestores(){
        this.tiposDePersonalizacion = new ArrayList<>();
    }
}
