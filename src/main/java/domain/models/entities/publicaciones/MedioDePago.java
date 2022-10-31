package domain.models.entities.publicaciones;

import domain.Persistente;
import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
public class MedioDePago extends Persistente {

    @ManyToOne
    @JoinColumn(name="publicacion_id", referencedColumnName="id")
    private Publicacion publicacion;
    @Column
    private String medioDePago;

    public void setMedioDePago(String nombreMedio, String user) {
         this.medioDePago = nombreMedio;

    }
}
