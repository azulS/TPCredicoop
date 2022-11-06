package SPRING.Repositorios.CarritoDeCompras;

import domain.models.entities.Carrito.CarritoDeCompras;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository //esto le marca a Sprint que en algun momento lo tiene que instanciar
public interface RepoCarrito {
    public void save(CarritoDeCompras carrito);

    List<CarritoDeCompras> all();
    Page<CarritoDeCompras> page(Pageable pageable);

    CarritoDeCompras porId(Integer idCarrito);

}
