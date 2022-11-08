package SPRING.DTOs;

import domain.models.entities.Carrito.CarritoDeCompras;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

@Projection(name="Carrito1", types = {CarritoDeCompras.class})
public interface CarritoDTO {
    @Value("#{target.id}")
    Integer getId();
    @Value("#target.Publicacion.getNombre()}")
    String nombreDePublicacion();
}
