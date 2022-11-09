package domain.models.entities.DTOs;

import domain.models.entities.usuario.Gestor;
import org.springframework.data.rest.core.config.Projection;

@Projection( name = "gestor1", types = {Gestor.class})
public interface GestorDTO {
    id
    productos cargados
}
