package domain.models.entities.DTOs;

import domain.models.entities.productos.Producto;
import domain.models.entities.usuario.Gestor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

@Projection( name = "gestor1", types = {Gestor.class})
public interface GestorDTO {
    @Value("#{target.id}")
    Long getIdGestor();
    @Value("#{target.productosCargados.size()}")
    int getCantidadDeProductosCargados();
    @Value("#{target.productosCargados.forEach(t->t.getNombre())}")
    String getProductosCargados();
}
