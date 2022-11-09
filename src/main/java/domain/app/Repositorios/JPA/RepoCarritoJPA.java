//package domain.app.Repositorios.JPA;
//
//import domain.models.entities.Carrito.CarritoDeCompras;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.rest.core.annotation.RepositoryRestResource;
//import org.springframework.data.rest.core.annotation.RestResource;
//
//@RepositoryRestResource (path = "carritoDeComprasController")
//public interface RepoCarritoJPA extends JpaRepository<CarritoDeCompras, Integer> {
//    @Override
//    @RestResource (exported = false)
//    void deleteById(Integer id);
//
//    @RestResource (exported = false)
//    void deleteById(CarritoDeCompras id);
//}
