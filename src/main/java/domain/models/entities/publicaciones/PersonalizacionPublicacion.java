package domain.models.entities.publicaciones;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

//@Entity
//@Getter
//@Setter
public class PersonalizacionPublicacion {

//    @ManyToOne
//    @JoinColumn(name="publicacion_id", referencedColumnName="id")
    private Publicacion publicacion;
//    @ElementCollection
//    @CollectionTable(name="PersonalizacionPublicacion_frasesDePersonlizacion",
//            joinColumns=@JoinColumn(name="PersonalizacionPublicacion_Id"))
    private List<String> frasesDePersonalizacion;
//    @OneToMany
    private List<Imagen> imagenesDePersonalizacion;
//    @OneToMany
    private List<PrecioPorArea> preciosPorPersonalizacion;

    public PersonalizacionPublicacion(){
        this.frasesDePersonalizacion =new ArrayList<>();
        this.imagenesDePersonalizacion =new ArrayList<>();
        this.preciosPorPersonalizacion =new ArrayList<>();
    }
}
