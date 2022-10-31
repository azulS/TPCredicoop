package domain.models.entities.publicaciones;

import domain.Persistente;
import domain.models.entities.productos.TipoDePersonalizacion;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table
public class Personalizacion extends Persistente {
    @Column
    private String contenido;
    @OneToOne
    private TipoDePersonalizacion tipo;
    @Column
    private int precio;

}
