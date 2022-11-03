package domain.models.entities.productos;

import domain.Persistente;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="TecnicaDeImpresion")
@Getter
@Setter
public class TecnicaDeImpresion extends Persistente {
    @Column
    public String nombre;
    @Column
    public String descripcion;

}
