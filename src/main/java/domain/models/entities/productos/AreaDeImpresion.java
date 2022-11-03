package domain.models.entities.productos;

import domain.Persistente;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
public class AreaDeImpresion extends Persistente {

    private String nombre;

}


// TODO: 3/11/2022 claramente hay que eliminar este objeto o algo asi porque que paja 