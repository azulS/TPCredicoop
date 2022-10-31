package domain.models.entities.publicaciones;

import domain.models.entities.productos.AreaDePersonalizacion;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

//@Entity
//@Getter
//@Setter
public class PrecioPorArea {
//    @ManyToOne
//    @JoinColumn(name = "PreciPorArea_id", referencedColumnName ="Id")
    private PersonalizacionPublicacion personalizacionPublicacion;

//    @Column
    private String nombre;
//    @Column
    private int precio;
//    @OneToOne
    private AreaDePersonalizacion areaDePersonalizacion;

}
