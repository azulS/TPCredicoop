package SPRING.Repositorios.Publicacion;

import domain.models.entities.publicaciones.Publicacion;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

@Repository
public interface RepoPublicacion {
    Page<Publicacion> page(Pageable pageable);

    Publicacion porId(Integer idPublicacion);

    public void savePublicacion(Publicacion publicacion);

    boolean existePublicacion(String nombre);
}
