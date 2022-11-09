//package SPRING.Repositorios.CarritoDeCompras;
//
//import domain.models.entities.Carrito.CarritoDeCompras;
//import domain.models.entities.usuario.Vendedor;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.PageImpl;
//import org.springframework.data.domain.Pageable;
//import org.springframework.stereotype.Repository;
//import SPRING.Repositorios.CarritoDeCompras.RepoCarrito;
//
//import java.time.LocalDate;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.stream.Collectors;
//
//@Repository
//public class RepoCarritoMemoria implements RepoCarrito {
//    private List<CarritoDeCompras> carritos;
//
//    public RepoCarritoMemoria(){
//        super();
//        carritos = new ArrayList<>();
//    }
//
//    @Override
//    public void saveCarrito(CarritoDeCompras carrito) {
//        carritos.add(carrito);
//        System.out.println(carrito);
//    }
//
//    @Override
//    public List<CarritoDeCompras> all() {
//        return this.carritos;
//    }
//    // TODO: 6/11/2022 habria que borrar estos repo.all?
//
//    @Override
//    public Page<CarritoDeCompras> page(Pageable pageable) {
//        int desde = pageable.getPageNumber()* pageable.getPageSize();
//        List<CarritoDeCompras> subList2 =
//                this.carritos.subList(desde, desde + pageable.getPageSize());
//        return new PageImpl<CarritoDeCompras>(subList2, pageable, this.carritos.size());
//    }
//
//    @Override
//    public CarritoDeCompras porId(Integer idCarrito) {
//        return this.carritos.stream().filter(x->x.getId().equals(idCarrito)).findFirst().get();
//    }
//
//}
