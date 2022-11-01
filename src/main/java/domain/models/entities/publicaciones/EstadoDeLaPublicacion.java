package domain.models.entities.publicaciones;

import domain.Persistente;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.text.DateFormat;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table
public class EstadoDeLaPublicacion extends Persistente {
    @ManyToOne
    @JoinColumn (name = "publicacion_id", referencedColumnName= "id")
    private Publicacion publicacion;

    @Column
    private LocalDate fecha;

    @Enumerated(EnumType.STRING)
    private Estado estado;
}
