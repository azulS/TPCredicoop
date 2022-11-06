package SPRING.Repositorios.Producto;

import domain.models.entities.productos.Producto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

@Repository
public interface RepoProductos {
    Page<Producto> page(Pageable pageable);

    Producto porId(Integer idProducto);

}
