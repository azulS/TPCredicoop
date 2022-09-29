package domain.publicaciones;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
@Getter
@Setter
public class PersonalizacionPublicacion {
    private List<String> frasesDePersonalizacion;
    private List<Imagen> imagenesDePersonalizacion;
    private List<PrecioPorArea> preciosPorPersonalizacion;

    public PersonalizacionPublicacion(){
        this.frasesDePersonalizacion =new ArrayList<>();
        this.imagenesDePersonalizacion =new ArrayList<>();
        this.preciosPorPersonalizacion =new ArrayList<>();
    }
}
