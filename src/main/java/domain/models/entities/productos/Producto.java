package domain.models.entities.productos;

import domain.Persistente;
import domain.models.entities.usuario.Gestor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="Producto")
@Getter
@Setter
public class Producto extends Persistente {

    @Column
    private String nombre;
    @ManyToOne
    @JoinColumn(name = "usuario_id", referencedColumnName = "id")
    private Gestor usuario;
    @Column
    private String descripcion;
    @Column
    private int precioBase;
    @Column
    private int tiempoDeFabricacion;
    @OneToMany
    private List<PersonalizacionGestores> personalizacionGestores;

    public Producto() {
        this.personalizacionGestores = new ArrayList<>();
    }
    public void agregarPersonalizacionGestores(PersonalizacionGestores personalizacionNueva) {
        this.personalizacionGestores.add(personalizacionNueva);
    }
}
