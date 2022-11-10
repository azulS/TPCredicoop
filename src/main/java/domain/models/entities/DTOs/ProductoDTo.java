package domain.models.entities.DTOs;

import domain.models.entities.productos.Producto;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

@Projection( name = "Producto1", types = {Producto.class})
public interface ProductoDTo {
    @Value("#{target.nombre}")
    String getNombre();

    @Value("#{target.descripcion}")
    String getDescripcion();

    @Value("#{target.precioBase}")
    int getPrecioBase();

    @Value("#{target.tiempoDeFabricacion}")
    int getTiempoDeFabricacion();

    @Value("#{target.personalizacionGestores.size()}")
    int getCantidadDePersonalizaciones();

    @Value("#{target.personalizacionGestores.forEach(t->t.getTecnicaDeImpresion()}")
    String getPersonalizaciones();
}
