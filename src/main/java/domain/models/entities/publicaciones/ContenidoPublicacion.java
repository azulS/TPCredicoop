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
public class ContenidoPublicacion extends Persistente {

    @Column
    private String nombre;
    @ManyToOne
    private Producto producto;
    @Column
    private int precio;
    @OneToMany
    @Transient
    private List<PersonalizacionVendedores> personalizacionesVendedores;

    public ContenidoPublicacion(){
        this.personalizacionesVendedores =new ArrayList<>();
    }

    public void agregarPersonalizacionVendedor(PersonalizacionVendedores personalizacionNueva){
        this.personalizacionesVendedores.add(personalizacionNueva);
    }
}
