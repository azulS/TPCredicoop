package domain.models.entities.publicaciones;

import domain.Persistente;
import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
public class MedioDePago extends Persistente {

    @Column
    private String medioDePago;
    
}

// TODO: 3/11/2022  hace falta este objeto? 
