package domain.models.entities.productos;

import domain.Persistente;
import domain.models.entities.usuario.GestorDeUsuarios;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
public class AreaDePersonalizacion extends Persistente {

    private String nombre;

}
