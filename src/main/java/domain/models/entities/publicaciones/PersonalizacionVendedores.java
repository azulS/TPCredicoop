package domain.models.entities.publicaciones;

import domain.Persistente;
import domain.models.entities.productos.TecnicaDeImpresion;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table
public class PersonalizacionVendedores extends Persistente {
    @ManyToOne
    @JoinColumn(name = "publicacion_id", referencedColumnName = "id")
    private Publicacion publicacion;
    @Column
    private String archivoImagen;
    @OneToOne
    private TecnicaDeImpresion tecnicaImpresion;
    @Column
    private int precio;

}
