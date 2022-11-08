package SPRING.Repositorios.CarritoDeCompras;

import domain.models.entities.Carrito.CarritoDeCompras;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

@RepositoryRestResource (path = "carritoDeComprasController") //esto es un controler que se genera automaticamente
                    // y me permite acceder a los atributos
                    //Spring me inventa un controler automatico
                    //la regla es que usa el id/la PK para entrar a los elementos particulares
public interface RepoCarritoJPA extends JpaRepository<CarritoDeCompras, Integer> {//entidad que queremos manipular, el tipo del id>
    CarritoDeCompras findByVendedor(Integer idVendedor);


    @Override
    @RestResource (exported = false)
    void deleteById(Integer id);

    @RestResource (exported = false)
    void deleteById(CarritoDeCompras id);
}


//Te hace el POSTMapping automaticamente
