package domain.models.entities.publicaciones;

import domain.Persistente;
import domain.models.entities.usuario.Vendedor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name="Publicacion")
@Getter
@Setter
public class Publicacion extends Persistente {
    @NotBlank
    @ManyToOne
    @JoinColumn (name = "usuario_id", referencedColumnName = "id")
    private Vendedor usuario;
    @OneToOne
    private ContenidoPublicacion contenidoPublicacion;
    @OneToMany
    private List<EstadoDeLaPublicacion> estadosDePublicacion;
    public Publicacion() {
        this.estadosDePublicacion = new ArrayList<>();
    }
    public void agregarEstadoDePublicacion(EstadoDeLaPublicacion estadoNuevo){
        this.estadosDePublicacion.add(estadoNuevo);
    }
}