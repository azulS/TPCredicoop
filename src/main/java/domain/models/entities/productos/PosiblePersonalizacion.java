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
public class PosiblePersonalizacion extends Persistente {
    @ManyToOne
    @JoinColumn(name = "personalizacion_id", referencedColumnName= "id")
    private Producto producto;

    @OneToOne
    private AreaDePersonalizacion areasBase;

    @OneToMany
    private List<TipoDePersonalizacion> tiposDePersonalizacion;

    public PosiblePersonalizacion(){
        this.tiposDePersonalizacion = new ArrayList<>();
    }
}
