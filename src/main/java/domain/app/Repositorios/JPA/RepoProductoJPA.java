package domain.app.Repositorios.JPA;

import domain.models.entities.DTOs.GestorDTO;
import domain.models.entities.DTOs.ProductoDTo;
import domain.models.entities.productos.Producto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource (path = "productos",excerptProjection = ProductoDTo.class)
public interface RepoProductoJPA extends JpaRepository <Producto, Long>{
    Page<Producto> findByNombre(String nombre, Pageable page);
    Page<Producto> findById(Long id, Pageable page);
    Page<Producto> findByPrecio(int id, Pageable page);
    Page<Producto> findByTiempoFabricacion(int id, Pageable page);
    Page<Producto> findByArea(String area, Pageable page);
}
