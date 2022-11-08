package SPRING.Repositorios.Producto;

import domain.models.entities.productos.Producto;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource (path = "productos")
public interface RepoProductoJPA extends JpaRepository <Producto, Integer> {
    Page<Producto> findProductoByNombre(String nombre);



}
