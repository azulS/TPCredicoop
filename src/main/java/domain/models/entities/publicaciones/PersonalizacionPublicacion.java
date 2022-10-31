package domain.models.entities.publicaciones;

import domain.Persistente;
import domain.models.entities.productos.Producto;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table
public class PersonalizacionPublicacion extends Persistente {

    @Column
    private String nombre;
    @ManyToOne
    private Producto productoBase;
    @OneToMany
    private List<Personalizacion> personalizaciones;
    @Column
    private int precio;

    public PersonalizacionPublicacion(){
        this.personalizaciones =new ArrayList<>();
    }
}
