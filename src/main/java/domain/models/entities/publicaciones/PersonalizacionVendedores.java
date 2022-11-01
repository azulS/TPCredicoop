package domain.models.entities.publicaciones;

import domain.Persistente;
import domain.models.entities.productos.TipoDePersonalizacion;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table
public class PersonalizacionVendedores extends Persistente {
    @Column
    private String contenido;
    @OneToOne
    private TipoDePersonalizacion tipo;
    @Column
    private int precio;

}
