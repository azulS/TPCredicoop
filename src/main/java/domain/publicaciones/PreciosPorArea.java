package domain.publicaciones;

import domain.productos.AreaDePersonalizacion;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PreciosPorArea {
    private String nombre;
    private AreaDePersonalizacion areaDePersonalizacion;
    private int precio;
}
